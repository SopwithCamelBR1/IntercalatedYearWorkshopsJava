
public class GoldCard extends CreditCard
{
	private int fee;
	
	public GoldCard(String name, String accountNumber, int amount, int limit, int fee)
	{
		super(name, accountNumber,amount, limit);
		this.fee = fee;
		setAmount(amount-fee);
	}

	public int getFee() 
	{
		return fee;
	}

	public void setFee(int fee) 
	{
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "GoldCard [fee=" + fee + ", getFee()=" + getFee()
				+ ", getName()=" + getName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAmount()=" + getAmount()
				+ ", getLimit()=" + getLimit() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
