
public class Goods 
{
	
	private String orderNumber;
	private double standardPrice;
	private boolean availability;
	
	public Goods(String orderNumber, double standardPrice, boolean availability)
	{
		this.orderNumber=orderNumber;
		this.standardPrice=standardPrice;
		this.availability=availability;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Goods [orderNumber=" + orderNumber + ", standardPrice="
				+ standardPrice + ", availability=" + availability + "]";
	}
	
	

}
