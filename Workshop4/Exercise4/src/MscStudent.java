
public class MscStudent extends Student 
{
	public MscStudent(String name, String studentIDNumber, int currentMark) 
	{
		super(name, studentIDNumber, currentMark);
	}
	
	public boolean hasPassed()
	{
		if(super.getCurrentMark()<50)
		{
			System.out.println("Student has failed");
			return false;
		}
		else
		{
			System.out.println("Student has passed");
			return true;
		}
				
	}
	
	

}
