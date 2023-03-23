package prog.java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
 
public class Prog9 {
	//convert string to date
	public static void main(String[] args) {
	        LocalDateTime ldt = LocalDateTime.now();
	        String formattedDateStr = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(ldt);
	        System.out.println("Formatted Date in String format: "+formattedDateStr);
	    }
	}

