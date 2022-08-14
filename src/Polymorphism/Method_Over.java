package Polymorphism;

public class Method_Over 
{
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	public void add(int c, int d)
	{
		int sum=c+d;
		System.out.println("Sum is "+sum);
	}
	public static void add(int a)
	{
		int sum=a+10;
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args)
	{	
		Method_Over os = new Method_Over();
		os.add();
		os.add(50,60);
		
		Method_Over.add(90);
				

	}

}
