package prog.java;

public class Prog19 {
//constructor overloading
	//public class Person 
//	{
	// Constructor overloading begins from here.	
	// Declare a non-parameterized constructor.
	   Prog19() { 
	     System.out.println("Hello");
	   }
	// Declare one parameterized constructor.
	   Prog19(String name) {
	     System.out.println(name);	
	   }
	// Main method.
	public static void main(String[] args) 
	{
	Prog19 p1 = new Prog19(); // calling non-parameterized constructor.
	  Prog19 p2 = new Prog19("John"); // calling one parameterized constructor.
	 }
	  
}
