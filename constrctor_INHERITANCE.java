package BesicJava;

class constrctor1
{
	 constrctor1(int a)
	{
		super();
		System.out.println("constrctor1 " + a);
	}
}

class constrctor2 extends constrctor1
{
	constrctor2(String s)
	{
		 super(44);
		System.out.println("constrctor2 " + s );
	}
}
class constrctor3 extends  constrctor2
{
	constrctor3(double q)
	{
		 super("ram");
		System.out.println("constrctor3 " + q);
	}
}
public class constrctor_INHERITANCE extends constrctor3
{

	public static void main(String[] args) 
	{
		constrctor3 j = new constrctor3(4.2);
		
		
	}
}

