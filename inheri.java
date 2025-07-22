package Mathex;

class Ab
{
   Ab(int h)
	{
		System.out.println("cont inheri");
	}
}
class  Bb extends Ab
{
       Bb(double d)  
	{
    	   super(6);
		System.out.println("cont inheri 2");
	}
}
public class inheri 
{
	
	public static void main(String[] args) 
	{
		new Bb(6.3);
	}
}