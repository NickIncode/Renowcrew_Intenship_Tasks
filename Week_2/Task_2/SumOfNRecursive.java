package com;
import java.util.*;

public class SumOfNRecursive {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the count here: ");
	      int n = sc.nextInt();
	      int sum = calculateSum(n);
	      System.out.println("Sum of first " + n + " natural numbers: " + sum);
	  }

	  static int calculateSum(int n) {
	      int sum = 0;
	      for (int i = 1; i <= n; i++) {
	          sum = sum + i;
	      }
	      return sum;
	      
	  }
	}


