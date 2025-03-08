package com.leap.app.leap;


public class App 
{
	public static boolean test(int year) {
		if((year%4==0 && year%100!=0)|| year%400==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
   
}
