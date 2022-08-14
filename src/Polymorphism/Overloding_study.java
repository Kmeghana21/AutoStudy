package Polymorphism;

public class Overloding_study
{
	public static void add(int a)
	{
		int sum=a+10;
		System.out.println("sum is "+sum);
	}
	
	public void add(int c, int d)
	{
		int sum=c+d;
		System.out.println("Sum is "+sum);
	}
	
	
}
