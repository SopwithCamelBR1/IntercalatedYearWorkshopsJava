import java.util.ArrayList;


public class ExamQuestionSimpleChoice extends ExamQuestion
{
	
	private ArrayList cAnswer = new ArrayList();

	public ExamQuestionSimpleChoice
			(String question, 
			int maximalMark)
	{
		super(question, maximalMark);
		this.cAnswer=cAnswer;
	}
	
	//setter for cAnswer. this adds a string to the Array list.

	public void setcAnswer(String cA) {
		cAnswer.add(cA);
	}
	
	public int answer(String a){
		for (int l =0; l < cAnswer.size(); l++)
		{
			if (a.equals(cAnswer[l]))
			{
				System.out.println(super.getMaximalMark());
				l=cAnswer.size();
			}
		}
	}
	
} //think my use of ARRAyList my be a bit wierd here. not sure I've used the right methods


