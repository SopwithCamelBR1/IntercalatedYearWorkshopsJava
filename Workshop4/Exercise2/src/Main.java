import java.util.ArrayList;

/**
 * 
 */

/**
 * @author acb131
 *
 */
public class Main 
{
	
		public static void main(String[] args)
		{
			ArrayList<Blood> mary = new ArrayList<Blood>();
		mary.add(new Blood(94,61, new Day(2,5,2013)));
		mary.add(new Blood(97,65, new Day(3,5,2013)));
		mary.add(new Blood(144,99, new Day(4,5,2013)));
		mary.add(new Blood(123,88, new Day(5,5,2013)));
		mary.add(new Blood(177,110, new Day(6,5,2013)));
		mary.add(new Blood(145,89, new Day(7,5,2013)));
		
		BloodPressure bloodPressure=new BloodPressure();
		bloodPressure.printResult(mary);
		bloodPressure.analyseBlood(mary);
		}
		
		
		
		
		
}
