
public class PerishableGoods extends Goods
{
	private int day;
	private int month;
	private int year;
	
	public PerishableGoods(String orderNumber, double standardPrice, boolean availability, int day, int month, int year)
	{
		super(orderNumber, standardPrice, availability);
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void newDate(int d,int m, int y)
	{
		CountingDays a=new CountingDays();
		if(a.daysBetweenDates(d, m, y, getDay(),getMonth(), getYear())<=8)
		{
			setStandardPrice(getStandardPrice()/2);
			System.out.println("Price has been halved");
		}
		else
		{
			if(a.daysBetweenDates(d, m, y, getDay(),getMonth(), getYear())<=2)
			{
				System.out.println("This product cannot be sold and must be destroyed immediately");
			}
			else
			{
				System.out.println(a.daysBetweenDates(d, m, y, getDay(),getMonth(), getYear()) + "days till product is out of date.");
			}
		}
	}
	
	
	

}
