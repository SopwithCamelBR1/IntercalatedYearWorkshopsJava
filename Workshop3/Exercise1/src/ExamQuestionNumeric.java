
public class ExamQuestionNumeric extends ExamQuestion
{
	private int correctAnswer;
	
	public ExamQuestionNumeric
			(String question, 
			int maximalMark,
			int correctAnswer)
	{
		super(question, maximalMark);
		this.correctAnswer=correctAnswer;
	}
	
	//getter and setter for correctAnswer

	public int getCorrectAnswer() 
	{
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) 
	{
		this.correctAnswer = correctAnswer;
	}
	
	//This next method takes the answer given and outputs the mark
	
	public int answer(int answerGiven)
	{
		if (answerGiven==correctAnswer)
		{
			return getMaximalMark();
		} 
		else
		{
			return 0;
		}
		
	}
	
	
}
