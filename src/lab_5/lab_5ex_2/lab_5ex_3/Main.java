package lab_5ex_3;
import java.util.*;

public class Main {
public static void main(String[] args) {
		
		System.out.println("Enter the salary of employee ---->");		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		try {
			if(salary<3000)
			{
				throw new EmployeeException("Exception");
			}
			System.out.println("The salary is = "+salary);
		}
		catch(EmployeeException e)
		{
			System.out.println("Caught exception - Salary is below 3000");
		}
	}


}
