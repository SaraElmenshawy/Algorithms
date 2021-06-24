package array;

import java.util.Arrays;

public class Median {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1=nums1.length;
		int n2=nums2.length;
		int size=n1+n2;
		int[]arr=new int[size];
		System.arraycopy(nums1, 0, arr, 0, n1);
	    System.arraycopy(nums2, 0, arr, n1, n2);
	    Arrays.sort(arr);
	    //System.out.println(Arrays.toString(arr));
	    double median=0;
	    int middleIndex=size/2;
		//System.out.println(middleIndex);
		if(size%2==0)
		{
			System.out.println("even");
			
			double sum=arr[middleIndex-1]+arr[middleIndex];
		    median=sum/2;
		    //System.out.println(median);
		}
		else
		{
			//System.out.println("odd");
			median=arr[middleIndex];
			//System.out.println(median);
		}
		return median;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Median M=new Median();
		int [] nums1= {1,3};
		int [] nums2= {2,4,7};
		double median=M.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

}
