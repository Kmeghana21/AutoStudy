//					******	space=0, row=6, 
//					 *****
//					  ****
//					   ***
//					    **
//					     *
package Patterns;

public class Eg3 {

	public static void main(String[] args)
	{
		int space=0, star=6;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}


	}

}
