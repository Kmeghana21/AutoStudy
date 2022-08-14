package LogicPattern;

import java.util.Scanner;

public class evenOoddNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int Num=sc.nextInt();
		
		if(Num%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is odd");
		}

	}

}
