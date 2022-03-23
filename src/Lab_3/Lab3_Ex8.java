package Lab_3;
import java.util.*;

public class Lab3_Ex8 {

public static void main(String[] args) {
		
		System.out.println("Enter a String here ---->");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		Lab3_Ex8 ps = new Lab3_Ex8();
		System.out.println(ps.string(str));
	}
    public boolean string(String str) {
    	char arr[] = str.toCharArray();
    	
    	for(int i = 0;i < arr.length - 1;i++) {
    			
    			int a = (int)arr[i];
    			int b = (int)arr[i+1];
    			
    			if(a > b) {
    				return false;
    			}
    	}
    	
    	return true;
    }
}
