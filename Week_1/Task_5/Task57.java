package task5;
import java.util.Scanner;

public class Task57 {
	
	

	  public static void main(String[] args) {
	    
	            int height, i = 0, j;
	            Scanner sc = new Scanner(System.in);

	            System.out.println("Enter the height of the triangle: ");
	            height = sc.nextInt();
	            System.out.println();

	            while (i < height) {
	                j = 0;
	                while (j < height - i) {
	                    System.out.print("*" + " ");
	                    j++;
	                }
	                System.out.println();
	                i++;
	            }
	            sc.close();

	        }
	    }


