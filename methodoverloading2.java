package Mathex;

public class methodoverloading2 {
	
	static void add(int a, int b)
	{
		int a1 = 2;
		int b1 = 5;
		int sum = a1 + b1;
		
		System.out.println("1st"+sum);
	}
	
	static void mul(int a, double c)
	{
		
		System.out.println("sss");
	}

	static void add(double a, int b)
	{
		System.out.println(3);
	}
	 void sub(double a, int b)
	{
		System.out.println(4);
	}

	
	public static void main(String[] args) 
	{
		
		mul(0 , 0);
		

	}

}
