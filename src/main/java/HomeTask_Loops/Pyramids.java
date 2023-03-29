package HomeTask_Loops;

public class Pyramids {

	public static void printPyramid(int rows,int num){
	      int  i, j;
	      int multiply=0;
	        // Loop to print multiplication
	        // table in triangular form
	        for (i = 0; i <=rows; i++) {
	            for (j = 1; j <= i; j++) {
	                
	                System.out.print(multiply * num + " ");
	                multiply++;
	                 
	            }
	            System.out.println();
	        }  
	}
	    public static void main(String[] args) {
	    	Pyramids.printPyramid(5,1);
	    }
	}

