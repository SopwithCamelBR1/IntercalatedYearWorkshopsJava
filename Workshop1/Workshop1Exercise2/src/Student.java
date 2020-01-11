
public class Student 
{
	private String name;
	private String idNumber;
	private String degreeProgramme;
	
	public Student(String n, String id, String degree) 
	{
		this.name = n;
		this.idNumber = id;
		this.degreeProgramme = degree;
	}
	
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{		
		this.name = name;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() 
	{
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) 
	{
		this.idNumber = idNumber;
	}

	/**
	 * @return the degreeProgramme
	 */
	public String getDegreeProgramme() 
	{
		return degreeProgramme;
	}

	/**
	 * @param degreeProgramme the degreeProgramme to set
	 */
	public void setDegreeProgramme(String degreeProgramme) 
	{
		this.degreeProgramme = degreeProgramme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student ["+ name + " ID: " + idNumber
				+ ", " + degreeProgramme + "]";
	}
	
}
