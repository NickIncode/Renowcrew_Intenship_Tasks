package task4;
import java.util.Scanner;

public class Task46 {
	

	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your website: ");
	    String website = sc.next();
	    if (website.endsWith(".org")) {
	      System.out.println("This is an organization website.");
	    } else if (website.endsWith(".com")) {
	      System.out.println(website + " is a commerical website.");
	    } else if (website.endsWith(".in")) {
	      System.out.println(website + " is an indian website.");
	    }
	    
	    sc.close();

	  }
	  

}
