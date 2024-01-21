package task4;
import java.util.Scanner;


public class Task42 {
	

	
	  public static void main(String[] args) {
	    int m1, m2, m3;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your marks in physics: ");
	    m1 = sc.nextInt();
	    
	     System.out.println("Enter your marks in chemistry: ");
	    m2 = sc.nextInt();
	     System.out.println("Enter your marks in mathematics: ");
	    m3 = sc.nextInt();

	    float avg = (m1 + m2 + m3) / 3.0f;
	    System.out.println("Your overall percentage  is: " + avg);

	    if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
	    {
	      System.out.println("Congratulations, you have been promoted");
	    }
	    else{
	      System.out.println("Sorry, you have not been promoted plz try again");
	      sc.close();
	    }
	    
	  }
}
