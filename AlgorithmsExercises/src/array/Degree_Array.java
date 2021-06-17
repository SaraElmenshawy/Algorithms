package array;

public class Degree_Array {

	public int findShortestSubArray(int[] nums) {
		int ans=0; 
	    int anchor=0;
	    for(int i=0;i<nums.length;i++)
	    {
	    	
	    	if(nums[i]==nums[anchor])
	    	{
	    		ans = Math.min(ans, i - anchor + 1);
	    	}
	    }
	    System.out.println(ans);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
