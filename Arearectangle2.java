package Assigments;
import java.util.Scanner;

public class Arearectangle2 {
	
	static void rectangle2() {
	Scanner sc = new Scanner(System.in); // Scanner syntax
	System.out.println("Enter the size : ");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double Formala = 2*(a+b);
	System.out.println("perimeter of rectangle " + Formala);
	sc.close();
	}
	
	public static void main(String[] args) {
		
		rectangle2();

	}
}
