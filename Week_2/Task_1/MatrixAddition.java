
public class MatrixAddition {
	 public static void main(String[] args) {
	      int matrix1[][] = {{1, 3, 5}, 
	                         {2, 6, 1}};
	      int matrix2[][] = {{4, 8, 9}, 
	                         {9, 2, 6}};
	      int result[][] = {{0, 0, 0}, 
	                        {0, 0, 0}};     //resultant matrix    
	      for (int i=0; i<matrix1.length; i++) {
	          for (int j = 0; j < matrix2[i].length; j++) {
	              result[i][j] = matrix1[i][j] + matrix2[i][j];
	              System.out.print(result[i][j] + " ");
	          }
	          System.out.println();
	      }           
	  }
	}


