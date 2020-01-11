
import java.io.*; // needed for


public class PictureModifier 
{
	public static void main(String[] args) 
	{
		// This set of code sets up a link to the file found at 
		// "acb131/Downloads/ComputerScience-in.pnm"
		// 
		InputStreamReader ir=new InputStreamReader(System.in);
		File myFile=new File("acb131/Downloads/ComputerScience-in.pnm");
		FileReader myRead;
		try 
		{
			myRead = new FileReader(myFile);
		} 
		catch (FileNotFoundException e) 
		{
			
			System.out.println("File Not Found"); // If file does not exist this will print out
		}
		BufferedReader rf=new BufferedReader(myRead);
		
		PrintWriter out = new PrintWriter("<insertfilenamehere>"); // this is outputs a file
		
		
		String line=rf.readLine();
				
		
		
		int lineNumber;
		
		for (lineNumber=1; lineNumber==2; lineNumber++)
		{
			String firstLine = rf.nextLine(); // this method doesn't want to work with Buffered reader - not sure how to fix
			out.println(firstLine);  // creates first line in new file
		}
		
		for (lineNumber=2; lineNumber==3; lineNumber ++)
		{
			try
			{
				int n = rf.next(); //gets height of picture
				int m = rf.next(); // gets widths of picture
						
				int newN = n/2;
				int newM = m/2;
				int [][] smallImage = new int [newN][newM];
			}
			catch (NumberFormatException e)
			{
				System.out.println("Expecting numbers on second line");
			}
		}
		
		for (lineNumber=3; lineNumber==4; lineNumber ++)
		{
			String firstLine = rf.nextLine();
			out.println(firstLine);  // creates third line in new file
		}
		
		//while(rf.hasNextline())
		//{
			// can't think of a way to average the pixels
		//}
		
				
	}
	
	

}
