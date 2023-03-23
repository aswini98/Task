package prog.java;
//method overriding
public class Prog3 {
	 void run(){
		 System.out.println("java is a programming language");
	 }  
}  
		//Creating a child class  
		class java extends Prog3{  
		  public static void main(String args[]){  
		  //creating an instance of child class  
		  java obj = new java();  
		  //calling the method with child class instance  
		  obj.run();  
		  }  
		}  

