package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.Club;

public class ClubModel {
	static final Logger logger = LogManager.getLogger(ClubModel.class.getName());

	protected static Club getClubData(JSONObject jsonObject) {
		Club clube = null;

		try {
			clube = new Club();
			clube.setId(jsonObject.getInt("id"));
			clube.setName(jsonObject.getString("name"));
			clube.setAbbrName(jsonObject.getString("abbrName"));
			if(!jsonObject.get("imgUrl").equals(null))
				clube.setImgUrl( jsonObject.getString("imgUrl"));
			clube.setImageUrls(ImageUrlModel.getImageUrlsData(jsonObject.getJSONObject("imageUrls")));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou club");

		logger.info("[club]");

		return clube;
	}
}
