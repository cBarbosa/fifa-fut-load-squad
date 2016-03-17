package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.DarkImage;
import sky.model.bo.ImageUrls;
import sky.model.bo.NormalImage;

public class ImageUrlModel {
	static final Logger logger = LogManager.getLogger(ImageUrlModel.class.getName());

	protected static ImageUrls getImageUrlsData(JSONObject jsonObject) {
		ImageUrls imgs = null;

		try {

			imgs = new ImageUrls();

			if(jsonObject.has("small")) imgs.setSmall(jsonObject.getString("small"));
			if(jsonObject.has("medium")) imgs.setMedium(jsonObject.getString("medium"));
			if(jsonObject.has("large")) imgs.setLarge(jsonObject.getString("large"));

			if(jsonObject.has("dark"))
				imgs.setDark(getImageDarkData(jsonObject.getJSONObject("dark")));

			if(jsonObject.has("normal"))
				imgs.setNormal(getImageNormalData(jsonObject.getJSONObject("normal")));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou imageUrls");

		logger.info("[imageUrls]");

		return imgs;
	}

	private static DarkImage getImageDarkData(JSONObject jsonObject) {
		DarkImage darkImg = null;

		try {
			darkImg = new DarkImage();
			darkImg.setSmall(jsonObject.getString("small"));
			darkImg.setMedium(jsonObject.getString("medium"));
			darkImg.setLarge(jsonObject.getString("large"));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou darkImg");

		logger.info("[imageUrls.dark]");

		return darkImg;
	}

	private static NormalImage getImageNormalData(JSONObject jsonObject) {
		NormalImage normImg = null;

		try {
			normImg = new NormalImage();
			normImg.setSmall(jsonObject.getString("small"));
			normImg.setMedium(jsonObject.getString("medium"));
			normImg.setLarge(jsonObject.getString("large"));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou imageUrls.normal");

		logger.info("[imageUrls.normal]");

		return normImg;
	}

}