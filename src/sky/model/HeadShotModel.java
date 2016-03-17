package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.Headshot;

public class HeadShotModel {
	static final Logger logger = LogManager.getLogger(SpecialImagesModel.class.getName());

	protected static Headshot getHeadShotData(JSONObject jsonObject) {
		Headshot headShot = null;

		try {
			headShot = new Headshot();
			headShot.setSmallImgUrl(jsonObject.getString("largeImgUrl"));
			headShot.setMedImgUrl(jsonObject.getString("medImgUrl"));
			headShot.setLargeImgUrl(jsonObject.getString("largeImgUrl"));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou headShot");

		logger.info("[headShot]");

		return headShot;
	}

}
