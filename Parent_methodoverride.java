package prog.java;

public class Parent_methodoverride {
	public void name() {
		System.out.println("parent name is Giri");
	}
	 class Child extends Parent_methodoverride {
		public void name() {
			System.out.println("child name is Aswinipriya");
			
		}
	}
		public static void main(String[] args) {
			Parent_methodoverride p= new Parent_methodoverride();
			
			p.name();
			
			
			
		}
	}


