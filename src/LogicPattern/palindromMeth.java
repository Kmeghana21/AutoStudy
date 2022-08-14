package LogicPattern;

import java.util.Scanner;

public class palindromMeth {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Value");
		
		String S=sc.next();
		String r="";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			r=r+S.charAt(i);
		}
		System.out.println("Actual String is "+S);
		System.out.println("Reverse String is "+r);
		
		if(S.equals(r))
		{
			System.out.println("Given Actual String is Palindrom");
		}
		else
		{
			System.out.println("Given String is Not Palindrom");
		}
	}

}
