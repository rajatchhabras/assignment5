package assignment5;

class A
{
public void print()
{
	System.out.println("The first function has run with no parametets ");
}
}
class B extends A
{
	public void print(int x)
	{
		System.out.println("The first function has run with one parametets "+x);
	}
}
class C extends B
{
	public void print(float x)
	{
		System.out.println("The first function has run with one parametets "+x);
	}
}
public class printOver {

	public static void main(String[] args) {
		C c=new C();
		c.print();
		c.print(10);
		c.print(10.20f);
	}

}
