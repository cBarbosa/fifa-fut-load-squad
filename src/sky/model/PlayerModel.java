package sky.model;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import sky.Configuration;
import sky.main.rs.JSONData;
import sky.model.bo.Player;

public class PlayerModel {
	static final Logger logger = LogManager.getLogger(PlayerModel.class.getName());
	static final String MSG_NOT_FOUND_JSON_DATA = "Não carregou carregou os dados(JSON)";

	public static ArrayList<Player> AtualizaSquad() {
		ArrayList<Player> players = null;

		try
		{
			if(Configuration.IS_WEB_LOCATION)
				players = getPlayersItemsUrl();
			else
				players = getPlayersItemsPath();
			logger.info("====================[ CARGA DE JOGADORES REALIZADA COM SUCESSO ]====================");
		} catch (Exception e)	{
			logger.error(null, e);
		}
		return players;
	}

	private static ArrayList<Player> getPlayersItemsUrl()
			throws Exception {
		int pages, indice;
		JSONObject playerItemList = null;

		indice = 605;
		ArrayList<Player> result = new ArrayList<Player>();
		do {

			try {
				playerItemList = JSONData.getJSONDataUrl(++indice);
			} catch (Exception e) {
				logger.warn(MSG_NOT_FOUND_JSON_DATA);
				throw new Exception(MSG_NOT_FOUND_JSON_DATA);
			}

			if(playerItemList == null || playerItemList.length() < 1)	{
				logger.warn(MSG_NOT_FOUND_JSON_DATA);
				throw new Exception(MSG_NOT_FOUND_JSON_DATA);
			}

			logger.info("Página atual: "+ playerItemList.getInt("page"));
			logger.info("Registros: "+ playerItemList.getInt("count"));
			logger.info("Total de páginas: "+ playerItemList.getInt("totalPages"));
			logger.info("Total de registros: "+ playerItemList.getInt("totalResults"));
			logger.info("Type: "+ playerItemList.getString("type"));

			result.addAll(fillItems(playerItemList.getJSONArray("items")));
			pages = playerItemList.getInt("totalPages");
		} while(pages > indice);

		return result;
	}

	private static ArrayList<Player> getPlayersItemsPath()
			throws Exception {

		JSONObject playerItemList = null;

		ArrayList<Player> result = new ArrayList<Player>();
		try {
			playerItemList = JSONData.getJSONDataPath();
		} catch (Exception e) {
			logger.warn(MSG_NOT_FOUND_JSON_DATA);
			throw new Exception(MSG_NOT_FOUND_JSON_DATA);
		}

		if(playerItemList == null || playerItemList.length() < 1)	{
			logger.warn(MSG_NOT_FOUND_JSON_DATA);
			throw new Exception(MSG_NOT_FOUND_JSON_DATA);
		}

		logger.info("Página atual: "+ playerItemList.getInt("page"));
		logger.info("Registros: "+ playerItemList.getInt("count"));
		logger.info("Total de páginas: "+ playerItemList.getInt("totalPages"));
		logger.info("Total de registros: "+ playerItemList.getInt("totalResults"));
		logger.info("Type: "+ playerItemList.getString("type"));

		result.addAll(fillItems(playerItemList.getJSONArray("items")));

		return result;
	}

	private static ArrayList<Player> fillItems(JSONArray jsonArray) {
		ArrayList<Player> players = new ArrayList<Player>();

		if(jsonArray.length() < 1)
			return null;

		for(int i = 0; i < jsonArray.length(); i++)
		{
		    JSONObject item = jsonArray.getJSONObject(i);
		    players.add(fillItem(item));
		}
		return players;
	}

	private static Player fillItem(JSONObject item) {
		Player player = new Player();

		player.setCommonName(item.getString("commonName"));
	    player.setFirstName(item.getString("firstName"));
	    player.setHeadshotImgUrl(item.getString("headshotImgUrl"));
	    player.setLastName(item.getString("lastName"));
	    player.setLeague(LeagueModel.getLeagueData(item.getJSONObject("league")));
	    player.setNation(NationModel.getNationData(item.getJSONObject("nation")));
	    player.setClub(ClubModel.getClubData(item.getJSONObject("club")));
	    player.setHeadshot(HeadShotModel.getHeadShotData(item.getJSONObject("headshot")));
	    player.setSpecialImages(SpecialImagesModel.getSpecialImagesData(item.getJSONObject("specialImages")));
	    player.setPosition(item.getString("position"));
	    player.setPlayStyle(item.getString("playStyle"));
	    if(!item.get("playStyleId").equals(null))
	    	player.setPlayStyleId(item.getString("playStyleId"));
	    player.setHeight(item.getInt("height"));
	    player.setWeight(item.getInt("weight"));
	    player.setBirthdate(item.getString("birthdate"));
	    player.setAge((short)item.getInt("age"));
	    player.setAcceleration((short)item.getInt("acceleration"));
	    player.setAggression((short)item.getInt("aggression"));
	    player.setAgility((short)item.getInt("agility"));
	    player.setBalance((short)item.getInt("balance"));
	    player.setBallcontrol((short)item.getInt("ballcontrol"));
	    player.setFoot(item.getString("foot"));
	    player.setSkillMoves((short)item.getInt("skillMoves"));
	    player.setCrossing((short)item.getInt("crossing"));
	    player.setCurve((short)item.getInt("curve"));
	    player.setDribbling((short)item.getInt("dribbling"));
	    player.setFinishing((short)item.getInt("finishing"));
	    player.setFreekickaccuracy((short)item.getInt("freekickaccuracy"));
	    player.setGkdiving((short)item.getInt("gkdiving"));
	    player.setGkhandling((short)item.getInt("gkhandling"));
	    player.setGkkicking((short)item.getInt("gkkicking"));
	    player.setGkpositioning((short)item.getInt("gkpositioning"));
	    player.setGkreflexes((short)item.getInt("gkreflexes"));
	    player.setHeadingaccuracy((short)item.getInt("headingaccuracy"));
	    player.setInterceptions((short)item.getInt("interceptions"));
	    player.setJumping((short)item.getInt("jumping"));
	    player.setLongpassing((short)item.getInt("longpassing"));
	    player.setLongshots((short)item.getInt("longshots"));
	    player.setMarking((short)item.getInt("marking"));
	    player.setPenalties((short)item.getInt("penalties"));
	    player.setPositioning((short)item.getInt("positioning"));
	    player.setPotential((short)item.getInt("potential"));
	    player.setReactions((short)item.getInt("reactions"));
	    player.setShortpassing((short)item.getInt("shortpassing"));
	    player.setShotpower((short)item.getInt("shotpower"));
	    player.setSlidingtackle((short)item.getInt("slidingtackle"));
	    player.setSprintspeed((short)item.getInt("sprintspeed"));
	    player.setStandingtackle((short)item.getInt("standingtackle"));
	    player.setStamina((short)item.getInt("stamina"));
	    player.setStrength((short)item.getInt("strength"));
	    player.setVision((short)item.getInt("vision"));
	    player.setVolleys((short)item.getInt("volleys"));
	    player.setWeakFoot((short)item.getInt("weakFoot"));
	    if(!item.isNull("traits"))
	    	player.setTraits(TraitModel.getTraitsData(item.getJSONArray("traits")));
	    if(!item.isNull("specialities"))
	    	player.setSpecialities(SpecialityModel.getSpecialitiesData(item.getJSONArray("specialities")));
	    player.setAtkWorkRate(item.getString("atkWorkRate"));
	    player.setDefWorkRate(item.getString("defWorkRate"));
	    player.setPlayerType(item.getString("playerType"));
	    if(!item.isNull("attributes"))
	    	player.setAttributes(AttributeModel.getAttributesData(item.getJSONArray("attributes")));
	    player.setName(item.getString("name"));
	    player.setQuality(item.getString("quality"));
	    player.setColor(item.getString("color"));
	    player.setIsGK(item.getBoolean("isGK"));
	    player.setPositionFull(item.getString("positionFull"));
	    player.setIsSpecialType(item.getBoolean("isSpecialType"));
	    if(!item.get("contracts").equals(null))
	    	player.setContracts(item.getString("contracts"));
	    if(!item.get("fitness").equals(null))
	    	player.setFitness(item.getString("fitness"));
	    if(!item.get("rawAttributeChemistryBonus").equals(null))
	    	player.setRawAttributeChemistryBonus(item.getString("rawAttributeChemistryBonus"));
	    if(!item.get("isLoan").equals(null))
	    	player.setIsLoan(item.getString("isLoan"));
	    player.setItemType(item.getString("itemType"));
	    if(!item.get("discardValue").equals(null))
	    	player.setDiscardValue(item.getString("discardValue"));
	    player.setId(item.getInt("id"));
	    player.setModelName(item.getString("modelName"));
	    player.setBaseId(item.getInt("baseId"));
	    player.setRating((short)item.getInt("rating"));

	    System.out.println(player.getFirstName()
	    		+" - "+ player.getPlayStyle()
	    		+" - "+ player.getQuality()
	    		+" - "+ player.getRating());

	    logger.info("[name] "+ player.getFirstName()
	    		+" / [id] "+ player.getId()
	    		+" / [playStyle] "+ player.getPlayStyle()
	    		+" / [quality] "+ player.getQuality()
	    		+" / [rating] "+ player.getRating());

		return player;
	}
}