package sky.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.model.bo.Nation;

public class NationModel {
	static final Logger logger = LogManager.getLogger(NationModel.class.getName());

	protected static Nation getNationData(JSONObject jsonObject) {
		Nation nacao = null;

		try {
			nacao = new Nation();
			nacao.setId(jsonObject.getInt("id"));
			nacao.setName(jsonObject.getString("name"));
			nacao.setAbbrName(jsonObject.getString("abbrName"));
			if(!jsonObject.get("imgUrl").equals(null)) nacao.setImgUrl( jsonObject.getString("imgUrl"));

			nacao.setImageUrls(ImageUrlModel.getImageUrlsData(jsonObject.getJSONObject("imageUrls")));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("carregou nation");

		logger.info("[nation]");

		return nacao;
	}

}
