import java.util.ArrayList;

public class BloodPressure 
{
		
	/*
		public static void main(String[] args)
		{
			
		mary.add(new Blood(94,61, new Day(2,5,2013)));
		mary.add(new Blood(97,65, new Day(3,5,2013)));
		mary.add(new Blood(144,99, new Day(4,5,2013)));
		mary.add(new Blood(123,88, new Day(5,5,2013)));
		mary.add(new Blood(177,110, new Day(6,5,2013)));
		mary.add(new Blood(145,89, new Day(7,5,2013)));
		printResult(mary);
		}
*/		
	
		 
		public void analyseBlood(ArrayList<Blood> mary)
		{
			int n=0;
			int highest=0;
			int diastolic = 0;
			int temp=0;
			while (n!=mary.size())
			{
				Blood a=mary.get(n);
				if(a.getSystolic()>highest)
				{
					highest=a.getSystolic();	
				}
				temp=diastolic;
				diastolic=a.getDiastolic()+temp;
				n++;
			}
			int average=diastolic/mary.size();
			if(highest>140)
			{
				System.out.println("Highest Systolic is " + highest + ". Average Diastolic is " + average + ".");
			}
			else
			{
				System.out.println("Systolic normal. Average Diastolic is " + average + ".");
			}
		}
		
		public void printResult(ArrayList<Blood> mary) 
		{
				for(int n=0; n<=mary.size()-1; n++)
				{
					System.out.println(mary.get(n).getDiastolic());	
				}
		}
		
		

	//	private static void printResult(ArrayList<Blood> mary) {
	//		System.out.println(mary);			
		

		
		

}
