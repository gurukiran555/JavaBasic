package BesicJava;

class parent1
{
	final void add()
	{
		System.out.println("que");
	}
}

public class overRiden extends parent1
{

	void add()
	{
		
		System.out.println("ans");
		
	}
	
	public static void main(String[] args) 
	{
		overRiden k = new overRiden();
		k.add();

	}

}
