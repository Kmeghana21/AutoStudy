package arrayStudy;

public class MultiDimentionalArray
{
	public static void main(String[] args)
	{
		int a[][]=new int[3][5];		//1. array declaration
		
		/*a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;						//2. assign value
		a[1][1]=4;				
		
		System.out.print(a[0][0] +"\t");
		System.out.println(a[0][1]);
		System.out.print("************\n");
		System.out.print(a[1][0] +"\t");
		System.out.println(a[1][1]);
		*/
		
		for (int i=0; i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	
	}
}
