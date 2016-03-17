package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.SpecialImages;

public class SpecialImagesModel {
	static final Logger logger = LogManager.getLogger(SpecialImagesModel.class.getName());

	protected static SpecialImages getSpecialImagesData(JSONObject jsonObject) {
		SpecialImages specImg = null;

		try {
			specImg = new SpecialImages();
			if(!jsonObject.get("medTOTWImgUrl").equals(null))
				specImg.setMedTOTWImgUrl(jsonObject.getString("medTOTWImgUrl"));
			if(!jsonObject.get("largeTOTWImgUrl").equals(null))
				specImg.setLargeTOTWImgUrl(jsonObject.getString("largeTOTWImgUrl"));
		} catch (Exception e)	{
			logger.error(null, e);
		}

		System.out.println("Carregou specialImages");

		logger.info("[specialImages]");

		return specImg;
	}
}
