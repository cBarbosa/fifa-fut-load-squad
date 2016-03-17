package sky.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import sky.main.rs.JSONData;

public class JsonUtil {
	
	static final Logger logger = LogManager.getLogger(JSONData.class.getName());

	public static String readUrl(String urlString)
				throws Exception, ConnectException, MalformedURLException {
        BufferedReader reader = null;
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader (url.openStream()));
            int read;
            char[]chars = new char[1024];

            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

        } catch (MalformedURLException e) {
        	e.printStackTrace();
        	logger.error(null, e);
        } catch (ConnectException e) {
        	e.printStackTrace();
        	logger.error(null, e);
        } catch (Exception e) {
			e.printStackTrace();
			logger.error(null, e);
        } finally {
            if (reader != null)
                reader.close();
        }
        return buffer.toString();
	}

	public static String readPath(String pathString)
			throws Exception, IOException, FileNotFoundException {
		BufferedReader reader = null;
		StringBuffer buffer = new StringBuffer();
		try {
			String line;
			reader = new BufferedReader(new FileReader(pathString));
			while ((line = reader.readLine()) != null)
				buffer.append(line + "\n");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			logger.error(null, e);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(null, e);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(null, e);
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
				logger.error(null, ex);
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error(null, ex);
			}
		}
		return buffer.toString();
	}
}
