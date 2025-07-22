package Mathex;

public class constructureoverloading 
{
	public constructureoverloading(String email )
	{
		System.out.println("login with email " + email);
	}
	public constructureoverloading(long mob )
	{
		System.out.println("login with mob "+ mob);
	}

	public static void main(String[] args) 
	{
		
		constructureoverloading cl = new constructureoverloading("guru");
		constructureoverloading col = new constructureoverloading(849489498498l);
		
		 new constructureoverloading("tarzon");
		

	}

}
