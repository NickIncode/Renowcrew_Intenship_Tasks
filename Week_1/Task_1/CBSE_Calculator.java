
import java.util.Scanner;

public class CBSE_Calculator {
	
	

	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the marks in English out of 100: ");
	    float eng = sc.nextFloat();
	    System.out.println("Enter the marks in Maths out of 100: ");
	    float math = sc.nextFloat();
	    System.out.println("Enter the marks in Science out of 100: ");
	    float sci = sc.nextFloat();
	    System.out.println("Enter the marks in Social Science out of 100: ");
	    float soc = sc.nextFloat();
	    System.out.println("Enter the marks in Hindi out of 100: ");
	    float hin = sc.nextFloat();

	    float total = eng + math + sci + soc + hin;
	    System.out.println("The total is: " + total);
	    float per = (total / 500) * 100;
	    System.out.println("The percentage is: " + per);

	  }

}
