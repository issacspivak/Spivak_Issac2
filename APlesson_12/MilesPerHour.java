import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mphr;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
	}
	
	public MilesPerHour(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}
	
	public void setParams(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	
	public double getMPHR()
	{
		mphr = distance /(double)(hours + minutes/60.00);
		return mphr;
	}
}