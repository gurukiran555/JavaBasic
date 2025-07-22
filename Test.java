package Mathex;

 class GrandParent {
    void login() {
        System.out.println("GrandParent login method");
    }
}

class Parent extends GrandParent
{
    void login() {
    	
        System.out.println("Parent login method");
       
    }
}

class Child extends Parent {
	
    void login() {
    	
        System.out.println("Child login method");
    }

}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.login();
        
    }
}