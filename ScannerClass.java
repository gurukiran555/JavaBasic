package BesicJava;
import java.util.Scanner;

public class ScannerClass {

	public void Areaofcircle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Radius od circle : ");
		double r = sc.nextDouble();
		double s = Math.PI*r*r;
		System.out.println("Area of circle is : "  + s);
	
	}
	public static void main(String[] args) {
		
		ScannerClass w = new ScannerClass();
		w.Areaofcircle(); //for non-static method	
	}

}
