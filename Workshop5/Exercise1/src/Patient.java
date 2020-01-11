
public class Patient implements Measurable {
	
	private String name;
	private int age;
	private double weight;
	
	public Patient(String name, int age, double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}



	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the weight
	 */
	
	public double getMeasure()
	{
		return weight;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", weight=" + weight
				+ "]";
	}
	
	
	
}
