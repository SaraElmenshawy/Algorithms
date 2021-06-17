package array;

public class OneWay {

	/*
	 * There are three types of edits that can be performed on strings: insert a character,
		remove a character, or replace a character
	 */
	public boolean isOneEdit(String A,String B)
	{
		int diff =Math.abs(A.length()-B.length());
		int max=Math.max(A.length(),B.length());
		char [] a=A.toCharArray();
		char [] b=B.toCharArray();
		if(diff>1 || A.equals(B))
		{
			System.out.println("sara"+diff);
			return false;
		}
		else if(diff==1)
		{
			int count=0;
			for(int i=0;i<max-1;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("sara "+a[i]+" "+b[i]);
					count++;
					if(count-diff>1)
					{
						System.out.println("sara 2"+diff);
						return false;
					}
				}	
			}
		}
		else
		{
			diff=0;
			for(int i=0;i<max-1;i++)
			{
				if(a[i]!=b[i])
				{
					diff++;
					if(diff>1)
					{
						return false;
					}
				}	
			}
		}
		return true ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=new OneWay().isOneEdit("peaks", "geeks");
		System.out.println(flag);
	}

}
