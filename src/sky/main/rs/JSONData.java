package sky.main.rs;

import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import sky.Configuration;
import sky.util.JsonUtil;

public class JSONData {
	
	static final Logger logger = LogManager.getLogger(JSONData.class.getName());

	public static JSONObject getJSONDataUrl(int indice)
			throws Exception {
		JSONObject result = null;

		try {
			result = new JSONObject(JsonUtil.readUrl(Configuration.URL_SQUAD.toString().replace("?", Integer.toString(indice))));
			logger.info("====================[ "
					+ Configuration.URL_SQUAD.toString().replace("?", Integer.toString(indice))
					+ " ]====================");
		} catch (ConnectException e) {
			logger.warn(e.getMessage());
		} catch (MalformedURLException e) {
			logger.warn(e.getMessage());
		} catch (Exception e) {
			logger.warn(e.getMessage());
		}
		return result;
	}

	public static JSONObject getJSONDataPath()
			throws Exception {
		JSONObject result = null;
		try {
			result = new JSONObject(JsonUtil.readPath(Configuration.PATH_SQUAD));
			logger.info("====================[ "
					+ Configuration.PATH_SQUAD
					+ " ]====================");
		} catch (FileNotFoundException e) {
			logger.warn(e.getMessage());
		} catch (Exception e) {
			logger.warn(e.getMessage());
		}
		return result;
	}
}