package array;

public class RotateImage {
	/*
	 * Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
	 */
	public void rotate(int[][] matrix) {
        int length=matrix.length;
        for (int i=0;i<length;i++)
        {
        	for (int j=i;j<length;j++)
        	{
        		int temp=matrix[i][j];
        		matrix[i][j]=matrix[j][i];
        		matrix[j][i]=temp;
        	}
        }
        
        for (int i=0;i<length;i++)
        {
        	for (int j=0;j<length/2;j++)
        	{
        		int temp=matrix[i][j];
        		matrix[i][j]=matrix[i][length-1-j];
        		matrix[i][length-1-j]=temp;
        	}
        	
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateImage RI=new RotateImage();
		int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		RI.rotate(matrix);
		 for (int i=0;i<matrix.length;i++)
	        {
	        	for (int j=0;j<matrix.length;j++)
	        	{
	        		System.out.print(matrix[i][j]);
	        	}
	        	System.out.println();
	        }
	}

}
