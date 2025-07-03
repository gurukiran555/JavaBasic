package Mathex;

public class thisclass {
	
	thisclass(int a)
	{
		
		System.out.println(1);
	}
	
	thisclass(double s)
	{
		this(66);
		System.out.println(2);
	}
	
	thisclass()
	{
		this(5.2);
		System.out.println(3);
	}
	

	public static void main(String[] args) 
	
	{
		new thisclass(32.5);
		

	}

}
