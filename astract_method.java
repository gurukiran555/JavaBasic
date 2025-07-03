package BesicJava;

 abstract class Abstract_m
{
	abstract void login();
	abstract void logout();
}	
public class astract_method extends Abstract_m
{
	public static void main(String[] args) 
	{
		astract_method k = new astract_method();
		k.login();
		k.logout();

	}

	void login() 
	{
		System.out.println("starting");
	}

	void logout() 
	{
		System.out.println("ending");
	}

	
	
}
