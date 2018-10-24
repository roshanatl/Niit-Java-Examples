package com.niit.PropertiesDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemoMain {
	public static void main(String[] s) {
	try (InputStream in = new FileInputStream("src/com/niit/PropertiesDemo/example.properties")) {
		Properties prop = new Properties();
		prop.load(in);
		System.out.println("==== Properties.getProperty usage ====");
		System.out.println(prop.getProperty("name"));
		System.out.println();

		System.out.println("==== Properties.stringPropertyNames usage ====");
		for (String property : prop.stringPropertyNames()) {
			String value = prop.getProperty(property);
			System.out.println(property + "=" + value);
		}
	} catch (IOException e) {		
		e.printStackTrace();
	}
	System.out.println();
	}
}
