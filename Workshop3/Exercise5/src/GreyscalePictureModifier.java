
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
		
		out.println("P2"); //sets first line as greyscale.
		
		
		
		while (rf.hasNextLine())
		{
			String line = rf.nextline();
			out.println(line);	//copies rest of document to file, not sure this will automatically turn it to grayscale.
		}
		
		