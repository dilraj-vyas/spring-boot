package com.producer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
public static void main(String[] args) throws ParseException {
	Date currentDate = new Date();  
    System.out.println("Current Date: "+currentDate);  
    DateFormat df=new SimpleDateFormat("yyyy/mm/dd");
    System.out.println(df.parse("Mon Jan 11 00:12:00 IST 2016"));
//    String dateToStr = DateFormat.getInstance().format(currentDate);  
//    System.out.println("Date Format using getInstance(): "+dateToStr);  
}
}
