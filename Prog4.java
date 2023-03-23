package prog.java;

//method overloading change datatype
public class Prog4 {
	public void add(int a,int b) {
		System.out.println("sum is "+(a+b));
		
	}
	public void add(double a,double b) {
		System.out.println("sum is "+(a+b));
		
	}
public static void main(String[] args) {
	Prog4 m1=new Prog4();
	m1.add(12, 2);
	m1.add(2.1, 3.2);
}
}
