package array;


public class UniqueString {

	/*
	 * Given a string, determine if the string has all unique characters
	 */
	//Additional data structure
	/*public boolean isUnique(String text)
	{
		HashMap<Character, Integer> textMap = new HashMap<Character,Integer>();
		for (int i = 0; i < text.length(); i++) {
            if(textMap.get(text.charAt(i))!=null)
            {
            	return false;
            }
            else
            {
            	textMap.put(text.charAt(i), 1);
            }
        }
		return true;
		
	}*/
	//without additional data structure
	//aSCCI CODE 128
	public boolean isUnique(String text)
	{
		if(text.length()>128)
		{
			return false;
		}
		
		boolean [] checkChar=new boolean[128];
		for (int i=0;i<text.length();i++)
		{
			int charNum=text.charAt(i);
			if(!checkChar[charNum])
			{
				checkChar[charNum]=true;
			}
			else
			{
				return false;
			}

		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=new UniqueString().isUnique("abcd10jk");
		System.out.println(flag);
	}

}
