package task2;
import java.util.Scanner;

public class Task22 {
	
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter initial velocity (u): ");
	            double u = scanner.nextDouble();

	            System.out.print("Enter final velocity (v): ");
	            double v = scanner.nextDouble();

	            System.out.print("Enter acceleration (a): ");
	            double a = scanner.nextDouble();

	            System.out.print("Enter displacement (s): ");
	            double s = scanner.nextDouble();

	            double result = calculateFinalVelocity(u, v, a, s);

	            System.out.println("Final velocity (V) is: " + result);

	            scanner.close();
	        }

	        private static double calculateFinalVelocity(double u, double v, double a, double s) {
	            double numerator = Math.pow(v, 2) - Math.pow(u, 2);
	            double denominator = 2 * a * s;

	            return numerator / denominator;
	        }
	    }


