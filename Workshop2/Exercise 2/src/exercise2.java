import java.util.ArrayList;
import java.util.Arrays;


public class exercise2 
{	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> exercise2Array = new ArrayList<Integer>(); //sets up an array with no fixed length
		
		int number;
	
		int maximum=300;
	
		for (number=0; number == maximum; number++);   // sets off a loop that tests every number for the criteria
		{
			if (number % 2 == 0)
			{
				if (number % 3 == 0)
				{
					if (number % 5 == 0)
					{
						if (number % 7 != 0)
						{
							if (number % 11 != 0)  //at this point the only number to have got through, should fulfil the criteria.
							{
								exercise2Array.add(number); //adds the number to the array
							} 
						}
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(exercise2Array)); // this method should print out the array: it works for exercise 3 but not 2 for some reason.
		
				
	}
	
	

}
