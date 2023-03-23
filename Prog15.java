package prog.java;

public class Prog15 {
	//reverse no palindrome or not
	public static void main (String args[]) {
	int num =121;
	int rev=0,temp=num;
	int count=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		count++;
	}	
	System.out.println(rev);
	System.out.println(count);
	
	if(rev==temp) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
	
}
}
	