package lab_5ex_2;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name and Last name --->");
		String first = sc.next();
		String last = sc.next();
		System.out.println("Fname--->"+ first + "\n");
		System.out.println("Lname--->"+ last  + "\n");
		try {
			if(first.equals("") || last=="")
			{
				throw new InvalidInputException("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(InvalidInputException e)
		{
			System.out.println("Plz enter the name correctly");
		}
	}

}
