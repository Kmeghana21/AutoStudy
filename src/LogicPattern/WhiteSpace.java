package LogicPattern;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) 
	{
		System.out.println("Your String");
		Scanner SC= new Scanner(System.in);
		String str=SC.nextLine();
		int counter=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char blank=str.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
		}
		System.out.println("Number of Blank Space "+str+" is "+counter);

	}

}
 