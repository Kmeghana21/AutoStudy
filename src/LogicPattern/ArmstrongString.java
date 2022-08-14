package LogicPattern;

import java.util.Scanner;

public class ArmstrongString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Value: ");
		
		int	Num=sc.nextInt();
		int sum=0;
		
		for(int i=Num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(Num==sum)
		{
			System.out.println("Given No is armstrong num");
		}
		else
		{
			System.out.println("Given No is not armstrong num");
		}

	}

}
