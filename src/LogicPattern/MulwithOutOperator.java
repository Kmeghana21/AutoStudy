package LogicPattern;

import java.util.Scanner;

public class MulwithOutOperator {

	public static void main(String[] args)
	{
		Scanner SC= new Scanner(System.in);
		
		System.out.println("Enter 1st Value");
		int Num1=SC.nextInt();
		
		System.out.println("Enter 2st Value");
		int Num2=SC.nextInt();
		int Sum=0,i=1;
		
//		for(int i=1;i<=Num2;i++)
//		{
//			Sum=Sum+Num1;
//		}
		
		while(i<=Num2)
		{
			Sum=Sum+Num1;
			i++;
		}
		System.out.println("Multiplication Value is \n"+Sum);
	}

}