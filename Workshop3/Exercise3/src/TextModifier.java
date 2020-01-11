import java.io.*; // needed for
import java.text.Normalizer;
import java.text.Normalizer.Form;


public class TextModifier 
{
	public static String main(String[] args) // is String instead
	{
		// This set of code sets up a link to the file found at 
		// "http://www.cs.bham.ac.uk/internal/courses/java/msc/handouts/exercises/DonQuixote.txt."
		// 
		InputStreamReader ir=new InputStreamReader(System.in);
		File myFile=new File("http://www.cs.bham.ac.uk/internal/courses/java/msc/handouts/exercises/DonQuixote.txt.");
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
		
		PrintWriter out = new PrintWriter("<filenamehere>");
		
		String currentLine;
		currentLine= rf.readLine();
		
		while (currentLine != null)
		{
			String newLine = Normalizer.normalize(currentLine.toLowerCase(), Form.NFC); // creates new string all of lower case and hopefully removing non-normal characters
			out.println(newLine);
		}
		
		// fr.readline();
	}
	

}
