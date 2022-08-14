package LogicPattern;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int Number= sc.nextInt();
		String s=Integer.toString(Number);
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		int revNum= Integer.parseInt(r);
		System.out.println("Actual Number is "+Number);
		System.out.println("Reverse Number is "+revNum);
		

	}

}
