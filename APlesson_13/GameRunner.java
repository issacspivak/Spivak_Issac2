public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xb1 = new XBox("XBox One");
		GameSystem xb2 = new XBox("XBox 360");
		Console xb3 = new XBox("XBox Original");
		
		System.out.println(xb1);
		System.out.println();
		System.out.println(xb2);
		System.out.println();
		System.out.println(xb3);
		System.out.println();
		
		PlayStation ps1 = new PlayStation("PS2");
		GameSystem ps2 = new PlayStation("PS3");
		Console ps3 = new PlayStation("PS4");
		
		System.out.println(ps1);
		System.out.println();
		System.out.println(ps2);
		System.out.println();
		System.out.println(ps3);
		System.out.println();
		
		PC pc1 = new PC("Razer");
		GameSystem pc2 = new PC("Alienware");
		
		System.out.println(pc1);
		System.out.println();
		System.out.println(pc2);
	}
}