package Access_Modifier;

public class Private_Use 
{
	int a=20;
	private int b=50;
	public int c=60;
	protected static int d=80;
	
	private void add()		//access specifier private
	{
		int a,b=10,c=20;
		a=b+c;
		System.out.println("value of a is "+a);
	}
	public void sub()		//access specifier public
	{
		int a,b=20,c=10;
		a=b-c;
		System.out.println("value of a is "+a);
	}
	void mul()			//access specifier default
	{
		int a,b=20,c=10;
		a=b*c;
		System.out.println("value of a is "+a);
	}
	protected static void display()		//access specifier protected		
	{
		System.out.println("Hii im Protected");
	}
	public static void main(String[] args) 
	{
		Private_Use u=new Private_Use();
		u.add();
		u.sub();
		u.mul();
		display();
		
		System.out.println("value of a is "+u.a);
		System.out.println("value of a is "+u.b);
		System.out.println("value of a is "+u.c);
		System.out.println("value of a is "+Private_Use.d);
	}

}
