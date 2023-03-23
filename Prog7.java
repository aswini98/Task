package prog.java;
import java.io.*;

public class Prog7 {
	
	    public static void main(String[] args) throws Exception
	    {
	         File file = new File(
	            "C:\\Users\\SysSoft\\Desktop\\bug.txt");
	 BufferedReader br= new BufferedReader(new FileReader(file));
	        String st;
	        
	        while ((st = br.readLine()) != null)
	 
	            // Print the string
	            System.out.println(st);
	    }
	
}
