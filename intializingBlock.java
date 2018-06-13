package assignment5;

public class intializingBlock {
	private static int s;
	private int p;
	static
	{
		s=10;
		
	}
	public static void doubl()
	{
		s=2*s;
		System.out.println("The value of static data member is "+s);
	}

	public static void main(String[] args) {
		
new intializingBlock();
intializingBlock.doubl();
	}

}
