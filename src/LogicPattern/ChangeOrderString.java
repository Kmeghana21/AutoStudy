package LogicPattern;

import java.util.Scanner;

public class ChangeOrderString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Your String ");
		String name=sc.next();
		String ar[]=name.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0)
			{
				String s=ar[i];
				ar[i]=revstring(s);
				
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]+"");
		}
		
	}

	private static String revstring(String input) {
		String rev=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		return rev;
	}

}
