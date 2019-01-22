package org.wltea.analyzer.cfg;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


public class PropertiesMethodUtil {
	private static Properties properties = null;
	private static Properties pro = null;
	
	public static Properties getProperties(String path) {
		try {
			InputStream is = PropertiesMethodUtil.class.getClassLoader()
					.getResourceAsStream(path);
			properties = new Properties();
			properties.load(is);
			return properties;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return properties;
	}
	
	public static Properties getProperties_UTF8(String path) {
		try {
			pro = new Properties();
			pro.load(new InputStreamReader(PropertiesMethodUtil.class.getClassLoader().getResourceAsStream(path), "UTF-8"));
			return pro;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return pro;
	}
	
}