package array;

public class URLify {

	public String UrlifyString(String S)
	{
		char[] arr=S.toCharArray();
		StringBuilder str= new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== ' ')
			{
				
				str.append("%20");
			}
			else
			{
			
				 str.append(String.valueOf(arr[i]));
			}
		}	
		System.out.println(str);
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new URLify().UrlifyString("sara elmenshawy ");
	}

}
