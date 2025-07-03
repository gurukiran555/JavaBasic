package BesicJava;

public class TicketCheck {

	    public static void main(String[] args) {
	        int child = 11;
	        int adult = 25;
	        int seniorCitizen = 72;
	        int handicapped = 22;

	        if (adult < 18) {  //false
	            System.out.println("Full ticket"); 

	            if (seniorCitizen == 60) { 
	                System.out.println("70% off");//false
	            } else {
	                if (handicapped == 1) {
	                    System.out.println("Free ticket");//false
	                } else {
	                    System.out.println("Should take full ticket"); //Execute
	                }
	            }

	        } else if (child <= 10) {
	            System.out.println("Half ticket");
	        } else {
	            System.out.println("Invalid age group"); // direct execute
	        }
	    }
	}
 
