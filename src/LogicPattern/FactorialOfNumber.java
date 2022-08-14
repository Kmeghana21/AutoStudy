package LogicPattern;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int Num=sc.nextInt();
		
		int fact=1;
		
		for(int i=Num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+Num+"! is " +fact);
	}

}
