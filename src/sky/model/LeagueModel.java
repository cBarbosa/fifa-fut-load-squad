package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.League;

public class LeagueModel {
	static final Logger logger = LogManager.getLogger(LeagueModel.class.getName());

	protected static League getLeagueData(JSONObject jsonObject) {
		League liga = null;

		try {
			liga = new League();
			liga.setId(jsonObject.getInt("id"));
			liga.setName(jsonObject.getString("name"));
			liga.setAbbrName(jsonObject.getString("abbrName"));
			if(!jsonObject.get("imgUrl").equals(null))
				liga.setImgUrl(jsonObject.getString("imgUrl"));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou league");

		logger.info("[league]");

		return liga;
	}

}
