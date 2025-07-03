package BesicJava;

public class switchClass {

	public static void main(String[] args) {

		switch (6)
		{
		case 1: System.out.println("monday");
		break; // not add break both will print
		
		case 2: 
			System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		
		default : System.out.println("choose right"); 
		
		}
		
	}

}
