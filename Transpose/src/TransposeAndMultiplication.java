//Program to Transpose a matrix and muiltiplying the elements


public class TransposeAndMultiplication {           //class name TransposeAndMultiplication

	public static void main(String[] args) {        //main() class
		
   //initializing and declaring array of type "INT" with name "matrix"
	int[][] matrix= {{1,2},{4,5},{8,9}};
		
    int i,j;
    int[][] trans_matrix =  new int[2][3];    //Initializing another array of type "INT" with name Trans_matrix
		
    for( i=0;i<matrix.length;i++)             //Using for loop for accessing matrix rows
    {
    	for( j=0;j<matrix.length;j++)         //Using for loop for accessing matrix columns
    	{
    		
    	  trans_matrix[i][j] = matrix[j][i];       //logic for transposing matrix
    		
    	  
    	  System.out.print(trans_matrix[i][j]+" ");       //printing matrix after transpose
    	}
    	
    	System.out.println();                            //for change line after a row is completed
    
    }
    
	}

}  //END-OF-PROGRAM
