package com.niit.Localization;

import java.text.NumberFormat;  
import java.util.*;  
  
public class NumberCurrencyFormat {  
  
static void printNumber(Locale locale){  
 double dbl=105000.3245;  
 NumberFormat formatter=NumberFormat.getNumberInstance(locale);  
 String number=formatter.format(dbl);  
 System.out.println(number+" for the locale "+locale);  
}  
  
public static void main(String[] args) {  
    printNumber(Locale.UK);  
    printNumber(Locale.US);  
    printNumber(Locale.FRANCE);  
    printNumber(Locale.JAPAN);  
    printNumber(new Locale("en", "IN"));
    
    printCurrency(Locale.UK);  
    printCurrency(Locale.US);  
    printCurrency(Locale.FRANCE);    
    printCurrency(new Locale("en", "IN"));
  
}  

static void printCurrency(Locale locale){  
	 double dbl=100.35;  
	 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
	 
	 String currency=formatter.format(dbl);  
	 System.out.println(currency+" for the locale "+locale  );  
	}  
	  
}  