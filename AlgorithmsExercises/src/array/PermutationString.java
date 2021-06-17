package array;

import java.util.Arrays;

public class PermutationString {

	/*
	 * Write a function to check whether two given strings are Permutation of each other or not.
	 *  A Permutation of a string is another string that contains same characters, only the order of characters can be different. 
	 * For example, “abcd” and “dabc” are Permutation of each other.
	 */
	public boolean isPermutation(String A,String B)
	{
		char []Aarr=A.toCharArray();
		char []Barr=B.toCharArray();
		if(Aarr.length!=Barr.length)
		{
			return false;
		}
		Arrays.sort(Aarr);
		Arrays.sort(Barr);
		if(!String.valueOf(Aarr).equals(String.valueOf(Barr)))
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPermutationStrings=new PermutationString().isPermutation("abcd", "dabc");
		System.out.println(isPermutationStrings);
	}

}
