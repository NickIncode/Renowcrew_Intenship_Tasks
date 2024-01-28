package com;
import java.util.*;
public class Fibonacci {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number position: ");
	      int n = sc.nextInt();
	      int ans = NthTermFibonacci(n);
	      System.out.println("The " + n + "th term of the Fibonacci series is: " + ans);
	  }

	  static int NthTermFibonacci(int num) {
	      if (num <= 1) {
	          return num; 
	          // Base case: The 0th and 1st terms are the number itself
	      } else {
	          return NthTermFibonacci(num - 1) + NthTermFibonacci(num - 2); 
	          // Recursive case
	      }
	  }
	}


