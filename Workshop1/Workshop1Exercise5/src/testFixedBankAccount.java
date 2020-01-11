
public class testFixedBankAccount 
{
	 public static void main(String[] args) 
	 {
		 FixedBankAccount testFixedBankAccount 
		 = new FixedBankAccount(100.00f, 1000);
		 		 
		 testFixedBankAccount.setDays(1000);
		 testFixedBankAccount.setInterestRate(0.01f);
		 
		 System.out.println(testFixedBankAccount);
	 }

}
