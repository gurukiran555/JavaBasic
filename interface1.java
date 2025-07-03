package BesicJava;
interface mod
{
	abstract void add();
	abstract void sub();
}
interface math2 extends mod
{
	void mul();
	void div();
}

public class interface1 implements math2
{
	public void mduls()
	{
		System.out.println("out");
	}

	public static void main(String[] args) 
	{
		interface1 k = new interface1();
		k.add();
		k.mduls();

	}

	public void add() {
		System.out.println("yen");
	}

	public void sub() {
		
	}

	public void mul() {
		
	}

	public void div() {
		
	}

}
