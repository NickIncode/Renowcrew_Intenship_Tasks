package com;

public class Average {
	static void calculateAverage(double arr[], int n){
	      n = arr.length; // count of elements present in array arr[]
	      double sum = 0.0;
	      for (double n1 : arr) 
	      {
	          sum = sum + n1;
	      }
	      System.out.println("Average is " + sum/n);
	  }
	  public static void main(String[] args) 
	  {
	      double numbers[] = {2.4, 4.0, 7.89, 6.23, 2.52}; // set of numbers 
	      int len = numbers.length;
	      calculateAverage(numbers, len);
	  }
	}


