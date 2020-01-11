
public class Main {
	
	public void main(String[] args)
	{
		Invoice i=new Invoice("123456", "725463", 231.56);
		System.out.println("Amount due is £" + i.getMeasure());
		
		Patient p=new Patient("Bob's your Uncle", 32, 76.5);
		System.out.println("Bob's weight is " + p.getMeasure() + "kg.");
	}

}
