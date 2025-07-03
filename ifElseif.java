package BesicJava;

public class ifElseif {

	public static void main(String[] args) {

		int age=25;
	
		if(age>=18)
		{
			System.out.println("cond1");
		}
		if(age==25)
		{
			System.out.println("cond2");
		}

		else if(age>=25)
		{
			System.out.println("else1");
		}
		else
		{
			System.out.println("NO vote");
		}
	}
}
