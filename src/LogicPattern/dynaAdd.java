package LogicPattern;

import java.util.Scanner;

public class dynaAdd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Your Name ");
		String name =sc.next();
		System.out.println("Your Name is "+name);
		
		
		System.out.println("\n Enter the No1");
		int Num1 =sc.nextInt();
		System.out.println("Enter the No2");
		int Num2 =sc.nextInt();
		
		int Sum =Num1 + Num2;
				
		System.out.println("Addition of Two No is "+Sum);
		
		
		
	}

}
