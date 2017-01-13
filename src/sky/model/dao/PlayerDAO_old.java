package sky.model.dao;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import sky.model.bo.Player;

public class PlayerDAO_old {
	static final Logger logger = LogManager.getLogger(PlayerDAO_old.class.getName());

	static String INSERT = "INSERT INTO `PLAYER` "
			+ "(id, baseId, itemType, modelName, name, quality, color, isGK,"
			+ " positionFull, isSpecialType, contracts, fitness,"
			+ " rawAttributeChemistryBonus, isLoan, discardValue, rating, commonName,"
			+ " firstName, lastName, headshotImgUrl, position, playStyle, playStyleId,"
			+ " height, weight, birthdate, foot, skillMoves, weakFoot, atkWorkRate, "
			+ " defWorkRate, playerType, age, acceleration, aggression, agility, balance,"
			+ " ballcontrol, crossing, curve, dribbling, finishing, freekickaccuracy,"
			+ " gkdiving, gkhandling, gkkicking, gkpositioning, gkreflexes, headingaccuracy,"
			+ " interceptions, jumping, longpassing, longshots, marking, penalties,"
			+ " positioning, potential, reactions, shortpassing, shotpower, slidingtackle,"
			+ " sprintspeed, standingtackle, stamina, strength, vision, volleys) VALUES "
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	static String UPDATE = "UPDATE `PLAYER` SET "
			+ "(baseId = ?, itemType = ?, modelName = ?, name = ?, quality = ?, color = ?, isGK = ?,"
			+ " positionFull = ?, isSpecialType = ?, contracts = ?, fitness = ?,"
			+ " rawAttributeChemistryBonus = ?, isLoan = ?, discardValue = ?, rating = ?, commonName = ?,"
			+ " firstName = ?, lastName = ?, headshotImgUrl = ?, position = ?, playStyle = ?, playStyleId = ?,"
			+ " height = ?, weight = ?, birthdate = ?, foot = ?, skillMoves = ?, weakFoot = ?, atkWorkRate = ?, "
			+ " defWorkRate = ?, playerType = ?, age = ?, acceleration = ?, aggression = ?, agility = ?, balance = ?,"
			+ " ballcontrol = ?, crossing = ?, curve = ?, dribbling = ?, finishing = ?, freekickaccuracy = ?,"
			+ " gkdiving = ?, gkhandling = ?, gkkicking = ?, gkpositioning = ?, gkreflexes = ?, headingaccuracy = ?,"
			+ " interceptions = ?, jumping = ?, longpassing = ?, longshots = ?, marking = ?, penalties = ?,"
			+ " positioning = ?, potential = ?, reactions = ?, shortpassing = ?, shotpower = ?, slidingtackle = ?,"
			+ " sprintspeed = ?, standingtackle = ?, stamina = ?, strength = ?, vision = ?, volleys = ? "
			+ " WHERE id = ?";

	static String SELECT_ALL = "SELECT * FROM `PLAYER`";

	static String SELECT_ID = "SELECT * FROM `PLAYER` WHERE id = ?";

	static String DELETE_ID = "DELETE FROM `PLAYER` WHERE id = ?";

	public void insert(Player player)	{
		// TODO Auto-generated method stub
	}

	public void update(Player player)	{
		// TODO Auto-generated method stub
	}

	public void getById(int id)	{
		// TODO Auto-generated method stub
	}

	public static void insert(ArrayList<Player> players) {
		// TODO Auto-generated method stub
	}

	public static void update(ArrayList<Player> players) {
		// TODO Auto-generated method stub
	}
}
