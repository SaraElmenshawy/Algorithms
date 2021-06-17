package array;

public class StringCompression {

	/*
	 * Implement a method to perform basic string compression using the counts
		of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
		"compressed" string would not become smaller than the original string, your method should return
		the original string. You can assume the string has only uppercase and lowercase letters (a - z).
	 */
	public String compressedString(String S)
	{
		char[] arr=S.toCharArray();
		StringBuilder str= new StringBuilder();
		char c= ' ';
	    int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=c)
			{   
				if(c !=' ')
				{
					str.append(String.valueOf(c));
					str.append(String.valueOf(count));
				}
				c=arr[i];
				count=1;
			}
			else
			{
				count++;
			}
		}
		str.append(String.valueOf(c));
		str.append(String.valueOf(count));
		return String.valueOf(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S=new StringCompression().compressedString("aabcccccaaa");
		System.out.println(S);
	}

}
