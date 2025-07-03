package BesicJava;

public class IIBBlock 
{
	static 
	{
		System.out.println("sib");
	}
	IIBBlock ()
	{
		System.out.println("constr"); //2nd execute
	}
	
	{
		System.out.println("IIB Block"); //1st execute 
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Main method"); //final
		new IIBBlock();

	}

}
