package array;

public class ZeroMatrix {
	/*
	 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
	   column are set to 0.
	 */
	public void setZeroes(int[][] matrix) {
		int numberOfColumns = matrix.length;
	    int numberOfRows = matrix[0].length;
	    int  [] columns=new int[numberOfColumns];
	    int [] rows=new int [numberOfRows];
	    for(int i=0;i<numberOfColumns;i++)
	    {
	    	for(int j=0;j<numberOfRows;j++)
	    	{
	    		if(matrix[i][j]==0)
	    		{
	    			columns[i]=1;
	    			rows[j]=1;
	    			
	    		}
	    	}
	    }
	    
	    for(int i=0;i<numberOfColumns;i++)
	    {
	    	for(int j=0;j<numberOfRows;j++)
	    	{
	    		if(columns[i]==1||rows[j]==1)
	    		{
	    			matrix[i][j]=0;
	    		}
	    	}
	    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroMatrix ZM=new ZeroMatrix();
		int [][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
		ZM.setZeroes(matrix);
		int numberOfColumns = matrix.length;
	    int numberOfRows = matrix[0].length;
	    for(int i=0;i<numberOfColumns;i++)
	    {
	    	for(int j=0;j<numberOfRows;j++)
	    	{
	    		System.out.print(matrix[i][j]+" ");
	    	}
	    	System.out.println();
	    }    	
	}

}
