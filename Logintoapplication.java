package BesicJava;

 class LaunchAndQuit extends QuitBrowser
 { //parent
	
	 static void lanch() {
		System.out.println("open browser");

	}
 }
public class Logintoapplication extends LaunchAndQuit
{

	public static void main(String[] args) {
		lanch();
		Quit();
	}

}
