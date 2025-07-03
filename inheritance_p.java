package Mathex;

class child1  extends grandpa 
{
	static {
		System.out.println("asnxjh");
	}
	public void sub() {
		System.out.println("user");
	}
}

public class inheritance_p extends child1
{

	public static void main(String[] args) {
		inheritance_p k = new inheritance_p();
		
	     k.sub();
	      
	    k.add();

	}
}
