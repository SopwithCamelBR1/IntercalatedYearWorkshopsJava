
public class AssessedWork {
	
	private String type;
	private double weighting; 
	private double maximalMark;
	private double actualMark;
	
	public AssessedWork(String type, double weighting, double maximalMark, double actualMark)
	{
		this.type=type;
		this.weighting=weighting;
		this.maximalMark=maximalMark;
		this.actualMark=actualMark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeighting() {
		return weighting;
	}

	public void setWeighting(int weighting) {
		if(weighting>=0 && weighting <=100)
		{
			this.weighting = weighting;
		}
		else
		{
			System.out.println("Weighting must be an integer between 100 and 0");
		}
	}

	public double getMaximalMark() {
		return maximalMark;
	}

	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}

	public double getActualMark() {
		return actualMark;
	}

	public void setActualMark(int actualMark) {
		this.actualMark = actualMark;
	}

	public double getFinalMark() {
		return actualMark / maximalMark * weighting;
	}
	
	@Override
	public String toString() {
		return "AssessedWork of type=" + type + "; weighting=" + weighting
				+ ", maximalMark=" + maximalMark + ".";
	}
	
	

}
