package Lab_1;

import java.util.*;

public class Ex_7 {

public static boolean checkNumber(int n){
	int k = n%10;
	while(n!=0) {
		int d = n%10;
		if(k>=d) {
			k=d;
			n = n/10;
			continue;
		}
		else {
			return false;
		}
	}
	return true;
	}





	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		
	sc.close();	
	}
}


