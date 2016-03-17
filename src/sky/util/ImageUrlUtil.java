package sky.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageUrlUtil {
	// URL http://pt.stackoverflow.com/questions/2673/como-pegar-imagens-na-internet-atrav%C3%A9s-do-java
	// https:\/\/fifa15.content.easports.com\/fifa\/fltOnlineAssets\/B488919F-23B5-497F-9FC0-CACFB38863D0\/2016\/fut\/items\/images\/players\/html5\/120x120\/229560.png
	static final String pathUrl = "https://fifa15.content.easports.com/fifa/fltOnlineAssets/B488919F-23B5-497F-9FC0-CACFB38863D0/2016/fut/items/images/players/html5/120x120/229560.png";

	public static void getImagem(String imgUrl) throws IOException	{
		String pathToSave = "F:\\database\\229560.png";

			URL urlObj = new URL(pathUrl);                                    
			HttpURLConnection  httpConnection = (HttpURLConnection)urlObj.openConnection();
			httpConnection.setRequestMethod("GET");
			InputStream inputStream = httpConnection.getInputStream();
			OutputStream outputStream = null;
			
			try {
			    int read = 0;
			    byte[] bytes = new byte[1024];
			    outputStream = new FileOutputStream(new File(pathToSave));
			    while ((read = inputStream.read(bytes)) != -1)
			        outputStream.write(bytes, 0, read);
			} catch (FileNotFoundException ex) {
			    ex.getMessage();
			} catch (IOException ex) {
			    ex.getMessage();
			} finally {
			    try {
			        if (outputStream != null) {
			            outputStream.close();
			        }
			    } catch (IOException ex) {
			        ex.getMessage();
			    }
			}
	}
}