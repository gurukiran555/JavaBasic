package Mathex;

public class AmazLogin 
{
	AmazLogin(long mobno)
	{
		System.out.println("enter mobno " + mobno);
	}
	
	public AmazLogin(String Email) 
	{
		System.out.println("enter Email " + Email);
	}
	
	public static void main(String[] args) 
	{
//		AmazLogin s1=	new AmazLogin(8456568998l);
//		AmazLogin s2= new AmazLogin("Guru@  ");
		
		new AmazLogin(8456568998l);
		new AmazLogin("Guru@ ");
	}

}
