package Patterns;
					//	  *			space=2; row=3; star=1
					//	 ***
					//  *****

public class Eg6 {

	public static void main(String[] args) 
	{
		int space=4, star=1;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			space--;
			star=star+2;
			System.out.println();
		}
		

	}

}
