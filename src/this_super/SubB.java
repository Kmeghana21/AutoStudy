package this_super;

public class SubB extends SuperUseA 
{

		int a=500;		//global variable of class b
	
	
	public static void main(String[] args)
	{
		SubB B = new SubB();
		B.display();
	}
	public void display()
	{
		int a=200;		//local variable
		
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a form same class is"+this.a);
		System.out.println("Global value of a from Super class is"+super.a);
	}
	
}