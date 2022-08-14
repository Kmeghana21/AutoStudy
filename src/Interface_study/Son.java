package Interface_study;

public class Son implements Mother,Father
{
	public static void main(String[] args) 
	{
		Son s= new Son();
		s.atitude();
		s.money();
		s.look();
		s.nature();
		s.laptop();
		s.love();		//calling default method from both interfaces
		Mother.test();  //calling static method from mother interface
		Father.test();  //calling static method from father interface
		
	}
	public void atitude()
	{
		System.out.println("fathers atitude completed in Son class");
		
	}
	public void money()
	{
		System.out.println("fathers atitude completed in Son class");
		
	}
	public void nature()
	{
		System.out.println("mother atitude completed in Son class");
		
	}
	public void look()
	{
		System.out.println("mother atitude completed in Son class");
		
	}
	
	public void laptop()
	{
		System.out.println("Son own property");
	}
	
	public void love()
	{
		Mother.super.love();	//calling mothers love method
		Father.super.love(); 	//calling fathers love method
		
	}


}
