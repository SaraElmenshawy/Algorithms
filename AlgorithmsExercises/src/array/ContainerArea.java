package array;

public class ContainerArea {
	/*
	 * Given n non-negative integers a1, a2, ..., an , 
	 * where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two end points of the line i is at (i, ai) and (i, 0). 
	 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
	 */
	 public int maxArea(int[] height) {
		 int maxArea=0;
		 int heightSize=height.length;
		 int pointer0=0;
		 int pointer1=heightSize-1;
		 while(pointer0<pointer1)
		 {
			 if(height[pointer0]<height[pointer1])
			 {
				 maxArea=Math.max(maxArea,height[pointer0]*(pointer1-pointer0) );
				 pointer0++;
			 }
			 else
			 {
				 maxArea=Math.max(maxArea,height[pointer1]*(pointer1-pointer0) );
				 pointer1--;
			 }
			 
		 }
		 
		return maxArea;	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerArea CA=new ContainerArea();
		int[] height= {1,8,6,2,5,4,8,3,7};
		int max=CA.maxArea(height);
		System.out.println(max);
	}

}
