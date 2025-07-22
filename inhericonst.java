package Mathex;
class inhericonst1 {

	public inhericonst1(double a) 
	{
		System.out.println("constinher");
	}
}
public class inhericonst extends inhericonst1
{
	public inhericonst(int a) 
	{
		super(6.5);
		System.out.println("constinher 6");
	}
	

}
