package BesicJava;

import java.util.Scanner; // must import

public class ScannerEx1 {

	public static void main(String[] args) { // we can write inside main method also
		Scanner sc = new Scanner(System.in); //create scanner class
		System.out.println("enter Radius of circle : ");
		double r = sc.nextDouble(); // take user input
		double s = Math.PI*r*r; // value calculate
		System.out.println("Area of circle is : "  + s); //print answer
		sc.close();
	}
}
