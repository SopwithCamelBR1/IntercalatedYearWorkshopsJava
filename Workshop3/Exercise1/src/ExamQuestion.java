
public class ExamQuestion 
{
	private String question;
	private int maximalMark;
	
	public ExamQuestion(String question, int maximalMark)
	{
		this.question=question;
		this.maximalMark=maximalMark;
	}
	
	//getters and setters from here

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getMaximalMark() {
		return maximalMark;
	}

	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}

		
	//toString method
	@Override
	public String toString() 
	{
		return "ExamQuestion [question=" + question + ", maximalMark="
				+ maximalMark + "]";
	}
		
	

}
