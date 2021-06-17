package array;

public class SolutionLCIS {

	public int findLengthOfLCIS(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
          
            ans = Math.max(ans, i - anchor + 1);
            System.out.println("i"+i+" anchor"+anchor+" result"+ans);
        }
        System.out.println(ans);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {7, 8, 9, 1, 2, 3};
		new SolutionLCIS().findLengthOfLCIS(nums);
	}

}
