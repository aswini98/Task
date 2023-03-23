package prog.java;

public class Prog1{
	public static void main(String[] args) {
		//String s="WELCOME";
		String s1="computerscience";
		String rev="";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--) {
			char c=s1.charAt(i);
			rev=rev+c;
			//count++;
		}
		System.out.println(rev);
		System.out.println(count);
		if(s1.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
				
		

		}
}

	

}

