package Lab_1;

import java.util.*;

public class Ex_6 {
	
	public static int calculateDifference(int n) {
		
		int SumOfSq = (n*(n+1)*(2*n+1))/6;
		int SumOfNo = (n*(n+1))/2;
		 SumOfNo = SumOfNo*SumOfNo;
		int Diff = (SumOfSq - SumOfNo);
		return Diff;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
		
	sc.close();	
	}
	
}
		

	
