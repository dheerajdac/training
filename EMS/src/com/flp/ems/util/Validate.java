package com.flp.ems.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {

	public static boolean validateKinId(){
		return true;
	}
	
	public static boolean validateDate(Date date,String str){
	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	   
	        if(str.equals(df.format(date)))
	        		return true;
	        else
	        	return false;
	}
}
