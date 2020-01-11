
public class FixedBankAccount 
{
	private float initialCapital;
	private int days;
	private float interestRate;
	private float totalCapital;
	private int years;
	
	public FixedBankAccount(float initialCapital, int d)
	{
		this.initialCapital = initialCapital;
		this.days = d;
		
	}

	

	/**
	 * @return the initialCapital
	 */
	public float getInitialCapital() 
	{
		return initialCapital;
	}

	/**
	 * @param initialCapital the initialCapital to set
	 */
	public void setInitialCapital(float initialCapital) 
	{
		this.initialCapital = initialCapital;
	}


	
	/**
	 * @return the years
	 */
	public int getYears() 
	{
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(int years) 
	{
		this.years = years;
	}

	


	/**
	 * @return the interestRate
	 */
	public float getInterestRate() 
	{
		return interestRate;
	}
	
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(float interestRate) 
	{
		this.interestRate = interestRate;
	}

	
	
     /**
	 * @return the totalCapital
	 */
	public float getTotalCapital() 
	{
		return totalCapital;
	}

	/**
	 * @param totalCapital the totalCapital to set
	 */
	public void setTotalCapital(float totalCapital) 
	{
		this.totalCapital = totalCapital;
	}

	
	/**
	 * @return the days
	 */
	public int getDays() 
	{	
		return days;
	}

	/**
	 * @param number of days time the interest rate
	 */
	public void setDays(int days) 
	{
		setYears(days/365);
		setTotalCapital(getInitialCapital()*(pow(getInterestRate(),getYears())));
		/*
		 * Attempting to use the total = capital*(1+interestRate)^years equation 
		 * did not work. Trying to use pow method led to eclipse saying pow was undefined
		 * 
		 */
	}
	

	//private float pow(float interestRate2, int years2) 
	//{
	//	return (pow(getInterestRate(),getYears()));
	//	// TODO Auto-generated method stub - eclipse told me to do this, does't seem to work.
	//	
	//}
	// This was what i attempted to use to solve pow not being recognized 
	// - but led to a StackOverflow error. Presumable due to it just looping.



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "With initial Capital of £" + initialCapital + " and interest rate 0f " +
		interestRate + "%, the total Capital after " + days + " days will be £ " + totalCapital + "   " + years;
	}
	
}
