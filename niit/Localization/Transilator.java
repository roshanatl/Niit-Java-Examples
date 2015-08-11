package com.niit.Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Transilator {

	public static void main(String[] args) {
		
		Locale locale = new Locale("en", "US");
		Locale locale_fr = new Locale("fr", "FR");
		Locale locale_gb = new Locale("en", "GB");

		ResourceBundle labels = ResourceBundle.getBundle("com.niit.Localization.ApplicationResources", locale_fr);
        
		System.out.println(labels.getString("label1"));
		
		labels = ResourceBundle.getBundle("com.niit.Localization.ApplicationResources", locale);
		
		System.out.println(labels.getString("label1"));
		
         labels = ResourceBundle.getBundle("com.niit.Localization.ApplicationResources", locale_gb);
		
		System.out.println(labels.getString("label1"));
	}

}


