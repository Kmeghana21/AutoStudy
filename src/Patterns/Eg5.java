package Patterns;
						//******* space=0, star=7; rows=4
						// *****
						//  ***
						//   *

public class Eg5 {

	public static void main(String[] args) 
	{
		int space =0, star=7;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
		
		

	}

}