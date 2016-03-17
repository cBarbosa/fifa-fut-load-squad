package sky.model;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;

import sky.model.bo.Attribute;

public class AttributeModel {
	static final Logger logger = LogManager.getLogger(AttributeModel.class.getName());

	protected static ArrayList<Attribute> getAttributesData(JSONArray jsonArray) {
		ArrayList<Attribute> attrs = null;
		Attribute attr = null;

		try {
			attrs = new ArrayList<Attribute>();

			for(int i = 0; i < jsonArray.length(); i++)	{
				attr = new Attribute();
				attr.setName(jsonArray.getJSONObject(i).getString("name"));
				attr.setValue((short)jsonArray.getJSONObject(i).getInt("value"));
				attr.setChemistryBonus(getChemistryBonusData(jsonArray.getJSONObject(i).getJSONArray("chemistryBonus")));
				attrs.add(attr);
			}
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou attributes");

		logger.info("[attributes]");

		return attrs;
	}

	private static ArrayList<Integer> getChemistryBonusData(JSONArray jsonArray) {
		ArrayList<Integer> chemistry = null;

		try {
			chemistry = new ArrayList<Integer>();
			for(int i =0; i < jsonArray.length(); i++)
				chemistry.add((int) jsonArray.get(i));
		} catch (Exception e) {
			logger.error(null, e);
		}

		System.out.println("Carregou chemistry");

		logger.info("[attributes.chemistry]");

		return chemistry;
	}
}