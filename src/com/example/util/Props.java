package com.example.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {
	private static String hashmapString;
	private static Properties configProps;

	public static String getHashmapString() {
		return hashmapString;
	}
	
	

	private static void setHashmapString(String hashmapString) {
		Props.hashmapString = hashmapString;
	}
	
	static {
		configProps = new Properties();
		
		try {
			configProps.load(new FileInputStream("Properties/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setHashmapString(configProps.getProperty("map.test.string"));
	}
}
