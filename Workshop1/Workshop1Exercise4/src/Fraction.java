
/*
 *  I don't think I understand this assignment - I'm not sure in what way it wants me to solve it.
 *  I've been unable to find a solution the way it seems to tell me too.
 */


public class Fraction 
{
	private int numerator;
	private int denominator;
	private int numeratorSum;
	private int denominatorSum;
	private int numeratorProduct;
	private int denominatorProduct;
	
	public Fraction(int n, int d)
	{
		this.numerator = n;
		this.denominator = d;
	}

	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	
		/**
	 * @return the numeratorSum
	 */
	public int getNumeratorSum() {
		return numeratorSum;
	}

	/**
	 * @param numeratorSum the numeratorSum to set
	 */
	public void setNumeratorSum() 
	{
		;
	}

	/**
	 * @return the denominatorSum
	 */
	public int getDenominatorSum() {
		return denominatorSum;
	}

	/**
	 * @param denominatorSum the denominatorSum to set
	 */
	public void setDenominatorSum(int denominatorSum) {
		this.denominatorSum = denominatorSum;
	}

	/**
	 * @return the numeratorProduct
	 */
	public int getNumeratorProduct() {
		return numeratorProduct;
	}

	/**
	 * @param numeratorProduct the numeratorProduct to set
	 */
	public void setNumeratorProduct(int numeratorProduct) {
		this.numeratorProduct = numeratorProduct;
	}

	/**
	 * @return the denominatorProduct
	 */
	public int getDenominatorProduct() {
		return denominatorProduct;
	}

	/**
	 * @param denominatorProduct the denominatorProduct to set
	 */
	public void setDenominatorProduct(int denominatorProduct) {
		this.denominatorProduct = denominatorProduct;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	

}
