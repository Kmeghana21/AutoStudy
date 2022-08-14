package LogicPattern;

import java.util.Scanner;

public class revNumWiOStrConvert {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int Number=sc.nextInt();
		int revNum=0;
		for(int i=Number;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);

	}

}
