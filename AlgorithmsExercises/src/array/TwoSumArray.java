package array;

public class TwoSumArray {
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	 */
	
	public int[] twoSum(int[] nums, int target) {
		int sum=0;
		int [] arr=new int [2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				sum=nums[i]+nums[j];
				if(sum==target)
				{
					arr[0]=i;
					arr[1]=j;
					return arr;
				}
			}
		}
		return arr;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumArray tsa=new TwoSumArray();
		int [] nums= {2,7,11,15};
		int [] arr =tsa.twoSum(nums, 9);
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.println(arr[i]);
		}
	}

}
