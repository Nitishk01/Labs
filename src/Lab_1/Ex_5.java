package Lab_1;

import java.util.*;
public class Ex_5 {

	public static int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0 || i%3==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
		System.out.println("123");
	sc.close();	
	}
}

