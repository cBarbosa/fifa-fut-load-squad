package sky.model.bo;

import java.util.ArrayList;

public class Player {
	private long id;
	private long baseId;
	private String itemType;
	private String modelName;
	private String name;
	private String quality;
	private String color; 
	private Boolean isGK;
	private String positionFull;
	private Boolean isSpecialType;
	private String contracts;
	private String fitness;
	private String rawAttributeChemistryBonus;
	private String isLoan;
	private String discardValue;
	private short rating;
	private String commonName;
	private String firstName;
	private String lastName;
	private String headshotImgUrl;
	private String position;
	private String playStyle;
	private String playStyleId;
	private int height;
	private int weight;
	private String birthdate;
	private String foot;
	private short skillMoves;
	private short weakFoot;
	private String atkWorkRate;
	private String defWorkRate;
	private String playerType;
	// campo defivado (dataAtual - dataNascimento)
	private short age;
	private short acceleration;
	private short aggression;
	private short agility;
	private short balance;
	private short ballcontrol;
	private short crossing;
	private short curve;
	private short dribbling;
	private short finishing;
	private short freekickaccuracy;
	private short gkdiving;
	private short gkhandling;
	private short gkkicking;
	private short gkpositioning;
	private short gkreflexes;
	private short headingaccuracy;
	private short interceptions;
	private short jumping;
	private short longpassing;
	private short longshots;
	private short marking;
	private short penalties;
	private short positioning;
	private short potential;
	private short reactions;
	private short shortpassing;
	private short shotpower;
	private short slidingtackle;
	private short sprintspeed;
	private short standingtackle;
	private short stamina;
	private short strength;
	private short vision;
	private short volleys;

	private League league;
	private Nation nation;
	private Club club;
	private Headshot headshot;
	private SpecialImages specialImages;
	private ArrayList<String> traits;
	private ArrayList<String> specialities;
	private ArrayList<Attribute> attributes;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBaseId() {
		return baseId;
	}
	public void setBaseId(long baseId) {
		this.baseId = baseId;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getIsGK() {
		return isGK;
	}
	public void setIsGK(Boolean isGK) {
		this.isGK = isGK;
	}
	public String getPositionFull() {
		return positionFull;
	}
	public void setPositionFull(String positionFull) {
		this.positionFull = positionFull;
	}
	public Boolean getIsSpecialType() {
		return isSpecialType;
	}
	public void setIsSpecialType(Boolean isSpecialType) {
		this.isSpecialType = isSpecialType;
	}
	public String getContracts() {
		return contracts;
	}
	public void setContracts(String contracts) {
		this.contracts = contracts;
	}
	public String getFitness() {
		return fitness;
	}
	public void setFitness(String fitness) {
		this.fitness = fitness;
	}
	public String getRawAttributeChemistryBonus() {
		return rawAttributeChemistryBonus;
	}
	public void setRawAttributeChemistryBonus(String rawAttributeChemistryBonus) {
		this.rawAttributeChemistryBonus = rawAttributeChemistryBonus;
	}
	public String getIsLoan() {
		return isLoan;
	}
	public void setIsLoan(String isLoan) {
		this.isLoan = isLoan;
	}
	public String getDiscardValue() {
		return discardValue;
	}
	public void setDiscardValue(String discardValue) {
		this.discardValue = discardValue;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHeadshotImgUrl() {
		return headshotImgUrl;
	}
	public void setHeadshotImgUrl(String headshotImgUrl) {
		this.headshotImgUrl = headshotImgUrl;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPlayStyle() {
		return playStyle;
	}
	public void setPlayStyle(String playStyle) {
		this.playStyle = playStyle;
	}
	public String getPlayStyleId() {
		return playStyleId;
	}
	public void setPlayStyleId(String playStyleId) {
		this.playStyleId = playStyleId;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
	public short getSkillMoves() {
		return skillMoves;
	}
	public void setSkillMoves(short skillMoves) {
		this.skillMoves = skillMoves;
	}
	public short getWeakFoot() {
		return weakFoot;
	}
	public void setWeakFoot(short weakFoot) {
		this.weakFoot = weakFoot;
	}
	public String getAtkWorkRate() {
		return atkWorkRate;
	}
	public void setAtkWorkRate(String atkWorkRate) {
		this.atkWorkRate = atkWorkRate;
	}
	public String getDefWorkRate() {
		return defWorkRate;
	}
	public void setDefWorkRate(String defWorkRate) {
		this.defWorkRate = defWorkRate;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public short getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(short acceleration) {
		this.acceleration = acceleration;
	}
	public short getAggression() {
		return aggression;
	}
	public void setAggression(short aggression) {
		this.aggression = aggression;
	}
	public short getAgility() {
		return agility;
	}
	public void setAgility(short agility) {
		this.agility = agility;
	}
	public short getBalance() {
		return balance;
	}
	public void setBalance(short balance) {
		this.balance = balance;
	}
	public short getBallcontrol() {
		return ballcontrol;
	}
	public void setBallcontrol(short ballcontrol) {
		this.ballcontrol = ballcontrol;
	}
	public short getCrossing() {
		return crossing;
	}
	public void setCrossing(short crossing) {
		this.crossing = crossing;
	}
	public short getCurve() {
		return curve;
	}
	public void setCurve(short curve) {
		this.curve = curve;
	}
	public short getDribbling() {
		return dribbling;
	}
	public void setDribbling(short dribbling) {
		this.dribbling = dribbling;
	}
	public short getFinishing() {
		return finishing;
	}
	public void setFinishing(short finishing) {
		this.finishing = finishing;
	}
	public short getFreekickaccuracy() {
		return freekickaccuracy;
	}
	public void setFreekickaccuracy(short freekickaccuracy) {
		this.freekickaccuracy = freekickaccuracy;
	}
	public short getGkdiving() {
		return gkdiving;
	}
	public void setGkdiving(short gkdiving) {
		this.gkdiving = gkdiving;
	}
	public short getGkhandling() {
		return gkhandling;
	}
	public void setGkhandling(short gkhandling) {
		this.gkhandling = gkhandling;
	}
	public short getGkkicking() {
		return gkkicking;
	}
	public void setGkkicking(short gkkicking) {
		this.gkkicking = gkkicking;
	}
	public short getGkpositioning() {
		return gkpositioning;
	}
	public void setGkpositioning(short gkpositioning) {
		this.gkpositioning = gkpositioning;
	}
	public short getGkreflexes() {
		return gkreflexes;
	}
	public void setGkreflexes(short gkreflexes) {
		this.gkreflexes = gkreflexes;
	}
	public short getHeadingaccuracy() {
		return headingaccuracy;
	}
	public void setHeadingaccuracy(short headingaccuracy) {
		this.headingaccuracy = headingaccuracy;
	}
	public short getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(short interceptions) {
		this.interceptions = interceptions;
	}
	public short getJumping() {
		return jumping;
	}
	public void setJumping(short jumping) {
		this.jumping = jumping;
	}
	public short getLongpassing() {
		return longpassing;
	}
	public void setLongpassing(short longpassing) {
		this.longpassing = longpassing;
	}
	public short getLongshots() {
		return longshots;
	}
	public void setLongshots(short longshots) {
		this.longshots = longshots;
	}
	public short getMarking() {
		return marking;
	}
	public void setMarking(short marking) {
		this.marking = marking;
	}
	public short getPenalties() {
		return penalties;
	}
	public void setPenalties(short penalties) {
		this.penalties = penalties;
	}
	public short getPositioning() {
		return positioning;
	}
	public void setPositioning(short positioning) {
		this.positioning = positioning;
	}
	public short getPotential() {
		return potential;
	}
	public void setPotential(short potential) {
		this.potential = potential;
	}
	public short getReactions() {
		return reactions;
	}
	public void setReactions(short reactions) {
		this.reactions = reactions;
	}
	public short getShortpassing() {
		return shortpassing;
	}
	public void setShortpassing(short shortpassing) {
		this.shortpassing = shortpassing;
	}
	public short getShotpower() {
		return shotpower;
	}
	public void setShotpower(short shotpower) {
		this.shotpower = shotpower;
	}
	public short getSlidingtackle() {
		return slidingtackle;
	}
	public void setSlidingtackle(short slidingtackle) {
		this.slidingtackle = slidingtackle;
	}
	public short getSprintspeed() {
		return sprintspeed;
	}
	public void setSprintspeed(short sprintspeed) {
		this.sprintspeed = sprintspeed;
	}
	public short getStandingtackle() {
		return standingtackle;
	}
	public void setStandingtackle(short standingtackle) {
		this.standingtackle = standingtackle;
	}
	public short getStamina() {
		return stamina;
	}
	public void setStamina(short stamina) {
		this.stamina = stamina;
	}
	public short getStrength() {
		return strength;
	}
	public void setStrength(short strength) {
		this.strength = strength;
	}
	public short getVision() {
		return vision;
	}
	public void setVision(short vision) {
		this.vision = vision;
	}
	public short getVolleys() {
		return volleys;
	}
	public void setVolleys(short volleys) {
		this.volleys = volleys;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public Headshot getHeadshot() {
		return headshot;
	}
	public void setHeadshot(Headshot headshot) {
		this.headshot = headshot;
	}
	public SpecialImages getSpecialImages() {
		return specialImages;
	}
	public void setSpecialImages(SpecialImages specialImages) {
		this.specialImages = specialImages;
	}
	public ArrayList<String> getTraits() {
		return traits;
	}
	public void setTraits(ArrayList<String> traits) {
		this.traits = traits;
	}
	public ArrayList<String> getSpecialities() {
		return specialities;
	}
	public void setSpecialities(ArrayList<String> specialities) {
		this.specialities = specialities;
	}
	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}
}