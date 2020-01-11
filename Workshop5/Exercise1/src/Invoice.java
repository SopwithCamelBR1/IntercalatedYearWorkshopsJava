
public class Invoice implements Measurable {
	
	private String accountNumber;
	private String sortCode;
	private double amountOwed;
	
	public Invoice(String accountNumber, String sortCode, double amountOwed)
	{
		this.accountNumber=accountNumber;
		this.sortCode=sortCode;
		this.amountOwed=amountOwed;
	}
	
	
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}



	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	/**
	 * @return the sortCode
	 */
	public String getSortCode() {
		return sortCode;
	}



	/**
	 * @param sortCode the sortCode to set
	 */
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}



	/**
	 * @return the amountOwed
	 */
	public double getAmountOwed() {
		return amountOwed;
	}



	/**
	 * @param amountOwed the amountOwed to set
	 */
	public void setAmountOwed(double amountOwed) {
		this.amountOwed = amountOwed;
	}
	
	

	/**
	 * @return the amountOwed
	 */
	public double getMeasure()
	{
		return amountOwed;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Invoice [accountNumber=" + accountNumber + ", sortCode="
				+ sortCode + ", amountOwed=" + amountOwed + "]";
	}
	
	
	
	
}
