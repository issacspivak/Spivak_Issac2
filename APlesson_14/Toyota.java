public class Toyota extends Car
{
	public Toyota(String c)
	{
		location = new double[2];
		
		String cSplit[] = c.split(", ");
		location[0] = Double.parseDouble(cSplit[0]);
		location[1] = Double.parseDouble(cSplit[1]);
	}
}