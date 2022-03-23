package Lab_3;
import java.util.*;

public class Lab3_Ex2 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String here---->");
		String str = sc.next();
		getImage(str);
		
		
	
		
	}
	
	
	static void getImage(String str){
		
		String string=str;
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(string + "|" + reverse);
		
		
		
	}

}
