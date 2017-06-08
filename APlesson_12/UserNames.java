public class UserNames
{

	private String userName, firstName, lastName;
	
	public UserNames()
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	

	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}