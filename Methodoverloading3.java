package Mathex;

public class Methodoverloading3
{
	static void login(String email)
	{
		System.out.println("enter email " + email);
	}
 
	static void login(long mobno)
	{
		System.out.println("enter mobile no. "+ mobno);
	}
	public static void main(String[] args) 
	{
		login("guru");
		login(6519489455555l);

	}

}
