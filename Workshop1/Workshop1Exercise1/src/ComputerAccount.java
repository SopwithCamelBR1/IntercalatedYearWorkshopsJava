
public class ComputerAccount 
{
	private String realName;
	private String userName;
	private String password;
	
	public ComputerAccount(String rName, String uName, String pword)
	{		
		this.realName = rName;
		this.userName = uName;
		this.password = pword;			
	}
	
	//getters and setters from this point onwards

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		this.password = newPassword;
	}

	@Override
	public String toString() {
		return "ComputerAccount [realName=" + realName + ", userName="
				+ userName + ", password=" + password + "]";
	}
		
}
