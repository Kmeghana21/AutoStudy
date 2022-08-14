package Casting;

public class PrimitiveCast 
{

	public static void main(String[] args) 
	{
		int a=5;	//lower data type 
		System.out.println(a);
		
		double b=a;	 // covert higher
		System.out.println(b);
		
		double z=10.5;  //higher data type
		System.out.println(z);
		
		int y=(int) z;
		System.out.println(y);
	}

}
