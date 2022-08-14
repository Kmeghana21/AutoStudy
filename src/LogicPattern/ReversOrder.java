package LogicPattern;

import java.util.Scanner;

public class ReversOrder {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Value : ");
		String Value= sc.next();
		
		String r="";
		
		for(int i=Value.length()-1;i>=0;i--)
		{
			r=r+Value.charAt(i);
		}
		
		System.out.println("Your Reverse Value is : "+r);	
	}

}
