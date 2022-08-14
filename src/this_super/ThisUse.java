package this_super;

public class ThisUse
{
	int a=100;		/*global
						variable*/
	int b=500;
	
	public static void main(String[] args) 
	{
		ThisUse tu=new ThisUse();
		tu.test();
	}
	
	public void test()
	{
		int a=20;	//local variable
		int sum=a+150;	//a value is local value
		System.out.println(sum);
		
		int sum1=this.a+150;	//a value is global value
		System.out.println(sum1);
		
		System.out.println("Local value a is"+a);
		System.out.println("Global value a is"+this.a);
		System.out.println("global b is " +this.b);
	}
}
