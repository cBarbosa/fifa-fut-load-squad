package sky.model;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;

public class SpecialityModel {
	static final Logger logger = LogManager.getLogger(SpecialityModel.class.getName());

	protected static ArrayList<String> getSpecialitiesData(JSONArray jsonArray) {
		ArrayList<String> specs = null;

		try {
			specs = new ArrayList<String>();
			for(int i =0; i < jsonArray.length(); i++)
				specs.add(jsonArray.get(i).toString());
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou Specialities");

		logger.info("[specialities]");

		return specs;
	}
}