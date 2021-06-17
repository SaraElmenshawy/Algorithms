package array;

import java.util.ArrayList;
import java.util.Collections;

public class Longest_Continuous_Increasing_Subsequence {

	public int findLengthOfLCIS(int[] nums) {
		int temp=nums[0];
		int count=1;
		if(nums.length==1)
		{
			return 1;
		}
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]>temp)
			{
				temp=nums[i];
				count ++;
				
			}
			else
			{;
				arrList.add(count);
				temp=nums[i];
				count=1;
				continue;
			}
			arrList.add(count);
		}
		Collections.sort(arrList);
		int result = arrList.get(arrList.size()-1);
		System.out.println(result);
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {7, 8, 9, 1, 2, 3};
		new Longest_Continuous_Increasing_Subsequence().findLengthOfLCIS(nums);
	}

}
