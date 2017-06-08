public abstract class GameSystem
{
	String platform;
	int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*9000000)+1000000;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public String toString()
	{
		return "Platform: " + platform + "\nSerial #: " + serialNo;
	}
}