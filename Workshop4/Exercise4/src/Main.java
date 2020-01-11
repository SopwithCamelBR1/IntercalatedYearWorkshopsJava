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
		MscStudent test=new MscStudent("Bob", "1234567", 0);
		test.addAssessedWork("Assignment", 100, 100, 45);
		test.addAssessedWork("Class Teast", 20, 100, 45);
		test.addAssessedWork("Assignment", 60, 200, 67);
		test.checkWeightings();
		test.finalMark();
	}
}
