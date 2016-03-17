package sky.model;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;

public class TraitModel {
	static final Logger logger = LogManager.getLogger(TraitModel.class.getName());

	protected static ArrayList<String> getTraitsData(JSONArray jsonArray) {
		ArrayList<String> traits = null;

		try {
			traits = new ArrayList<String>();
			for(int i =0; i < jsonArray.length(); i++)
				traits.add(jsonArray.get(i).toString());
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou traits");

		logger.info("[traits]");

		return traits;
	}
}
