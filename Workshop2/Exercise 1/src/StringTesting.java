
public class StringTesting {
	
	
	public static void main(String[] args)
	{
		String first = "test";
		String second = "tEst";
		
		if (first.equalsIgnoreCase(second)) // this condition compares the strings ignoring differences in the case between characters
		{
			System.out.println("Strings are the same");
		}
			else
			{		
			System.out.println("Strings are different");
			}
	}
	

}
