package Polymorphism;

public class B extends A
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		
		a.test();
		a.test();
		
	}
	
	public void test()
	{
		System.out.println("B's test method");
	}
}
