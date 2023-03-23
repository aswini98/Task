package prog.java;

public class Prog5 {
	
	    void mul(int a, int b) {
	        System.out.println("Sum of two=" + (a * b));
	    }

	    void mul(int a, int b, int c) {
	        System.out.println("Sum of three=" + (a * b * c));
	    }
	
	
	    public static void main(String args[]) {
	        Prog5 m = new Prog5();
	        m.mul(6, 10);
	        m.mul(10, 6, 5);
	    }
	}


