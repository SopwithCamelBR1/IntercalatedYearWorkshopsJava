
public class Weight 
{
	private double pounds;
	private double kilograms;	
	
	public Weight(double p)
	{
		this.pounds = p;
		this.kilograms = p*0.45359237;
	}

	/**
	 * @return the pounds
	 */
	public double getPounds() {
		return pounds;
	}

	/**
	 * @param pounds the pounds to set
	 */
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}

	/**
	 * @return the kilograms
	 */
	public double getKilograms() {
		return kilograms;
	}

	/**
	 * @param kilograms the kilograms to set
	 */
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Object with weight " + pounds + " pounds is " + kilograms + " kilograms.";
	}

	
}
