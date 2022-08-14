package LogicPattern;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int Num=sc.nextInt();
		int counter=0;
		
		for(int i=2;i<Num;i++)
		{
			if(Num%i==0)
			{
				counter++;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("Given No is Not a prime Number");
		}
		else
		{
			System.out.println("Given No is Prime Number");
		}
	}

}
