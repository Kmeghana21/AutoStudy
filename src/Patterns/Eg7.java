package Patterns;
						//   *		space=3, rows=4, 
						//  * *
						// * * *
						//* * * *
public class Eg7 {

	public static void main(String[] args) {
		
		int space=3, star=1; 
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star;j++)
			{
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}

	}

}