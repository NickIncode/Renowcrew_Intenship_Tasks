package com;
import java.util.*;


public class Conversion {
	static void convertToFarenheit(double temp){
	      double FH = (1.8 * temp) + 32;
	      System.out.println("The temperature in FARENHEIT is " + FH);
	  }
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the tempeature in CELSIUS: ");
	      double Celsius = sc.nextDouble();
	      convertToFarenheit(Celsius);
	      sc.close();
	  }
	}


