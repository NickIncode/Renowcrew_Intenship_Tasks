package task5;
import java.util.Scanner;


public class Task55 {

	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the No you want to find factorial: ");
	    int n = sc.nextInt();
	    int res = 1;

	    for (int i = 1; i <= n; i++) {
	      res = res * i;

	    }
	    System.out.println("Factorial of given no is: " + res);
	    sc.close();

	  }

}
