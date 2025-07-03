package BesicJava;

public class Constructer_Chaining 
{
	Constructer_Chaining()
	{
		this(25);
		System.out.println("empty constructor");
	}
	
	Constructer_Chaining(int a)
	{
		this(55,20);
		System.out.println(a);
	}
	
	Constructer_Chaining(int c, int d)
	{
		
		System.out.println(c+d); 
	}

	public static void main(String[] args) 
	{
		new Constructer_Chaining();

	}

}
