import java.util.Arrays;

public class BubbeSort {
	
	public static void main(String[] args)
	{
		int[] exercise3Array = {4, 3, 6, 1, 9, 2};
		
		System.out.println(Arrays.toString(exercise3Array));
		System.out.println("goes to:");
		
		int arrayNumber;
		boolean contin = true;
		int swap;
		
		while ( contin ) 
		{				
			for (arrayNumber=0; arrayNumber > exercise3Array.length-1; arrayNumber++)  //sets up loop that goes through array
			{
				if	(exercise3Array[arrayNumber] > exercise3Array[arrayNumber+1]) 
				{
					// following should swap round two numbers if the first is larger then the second. does not seem to be working
					swap = exercise3Array[arrayNumber];
					exercise3Array[arrayNumber] = exercise3Array[arrayNumber+1];
					exercise3Array[arrayNumber+1]= swap;
					contin = true;  //sets the loop of again, so it will continue going through array till no swaps have occured.                    
				} else {
					contin = false; // stops loop
				}
			}
		}
					
		System.out.println(Arrays.toString(exercise3Array)); // should print out a new array, doesn't seem to work.	
				
	}

}
