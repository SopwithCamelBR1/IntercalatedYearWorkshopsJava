import java.util.ArrayList;


public class Student 
{
			
		private String name;
		private String studentIDNumber;
		private int currentMark;
		ArrayList<AssessedWork> assessedWork=new ArrayList<AssessedWork>();
		
		public Student(String name, String studentIDNumber, int currentMark)
		{
			this.name=name;
			this.studentIDNumber=studentIDNumber;
			this.currentMark=currentMark;
		}

		//Getters and setters from this point
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStudentIDNumber() {
			return studentIDNumber;
		}

		public void setStudentIDNumber(String studentIDNumber) {
			this.studentIDNumber = studentIDNumber;
		}

		public int getCurrentMark() {
			return currentMark;
		}
		
		public void setCurrentMark() {
			this.currentMark = (int)calculateFinalMark();//see method below
		}
		
		//Method to add an assessed	work to the student		
		public void addAssessedWork(String type, int weighting, int maximalMark, int actualMark) 
		{
			assessedWork.add(new AssessedWork(type, weighting, maximalMark, actualMark));
		}
		
		//Method that checks the weightings adds up to 100%, and if not sets it so that they are
		public void checkWeightings()
		{
			int n=0;
			int totalWeighting=0;
			while(n!=assessedWork.size())
			{
				int temp=totalWeighting;
				AssessedWork a=assessedWork.get(n);
				totalWeighting=(int) (temp+a.getWeighting());//???double?
				n++;
			}
			if(totalWeighting==100)
			{
				System.out.println("Student has taken 100% of Credits");
			}
			else
			{
				if(totalWeighting>100)
				{
					System.out.println("Student has taken too many Credits, credits have been recalculated");
				}
				else
				{
					System.out.println("Student has taken too few Credits, credits have been recalculated");
				}
				int coefficient=100/totalWeighting;
				while(n!=assessedWork.size()) // this loop resets all weighting using coefficient calculated above.
				{
					AssessedWork a=assessedWork.get(n);
					a.setWeighting((int)a.getWeighting()*coefficient);
				}
			}
		}
		
		
		
		//Method Calculates finalMark
		public double calculateFinalMark()
		{
			int n=0;
			double finalMark=0;
			while(n!=assessedWork.size())
			{
				double temp=finalMark;
				AssessedWork a=assessedWork.get(n);
				finalMark= temp + a.getFinalMark();
				
				//((a.getActualMark() / a.getMaximalMark())); 
				//*  a.getWeighting()); 
				//(???double?) This calculates what each assessment adds to the final mark.
				n++;
				
			}
			return finalMark;
		}
		
		
		public void finalMark()
		{
			System.out.println("Final Mark of student " + getStudentIDNumber() + " is " + calculateFinalMark() + "%.");
		}
		
			

}
