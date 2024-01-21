import java.util.Scanner;


public class KilometresToMiles {
	
	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number of kilometres you want to convert to mile: ");
	    double kilometres = sc.nextDouble();
	    double miles = kilometres * 0.621371;
	    System.out.println(kilometres + " kilometres is equal to " + miles + " miles.");
	    sc.close();
	  }

}
