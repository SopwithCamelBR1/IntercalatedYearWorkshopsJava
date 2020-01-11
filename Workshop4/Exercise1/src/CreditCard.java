
public class CreditCard 
{
	
	private String name;
	private String accountNumber;
	private int amount;
	private int limit;
	
	public CreditCard(String name, String accountNumber, int amount, int limit)
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.limit=limit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", accountNumber=" + accountNumber
				+ ", amount=" + amount + ", limit=" + limit + "]";
	}
	
	

}
