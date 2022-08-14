package Abstract_study;

public class Abstract_Test
{

	public static void main(String[] args) 
	{
		Concrete_Use c=new Concrete_Use();
		
		c.test1();					//complete abstract class
		c.test2();					//complete abstract class
		c.test3();					//method completed in concrete class
		c.test4();					//method complete in concrete class--> own method

	}

}
