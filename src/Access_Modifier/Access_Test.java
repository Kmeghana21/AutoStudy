package Access_Modifier;

public class Access_Test 		//created class in same package
{

	public static void main(String[] args) 
	{
		Private_Use pu= new Private_Use();	//create object of other class
		pu.sub(); 		//calling public method of other class within same package-->allowed in project
		pu.mul(); 		//calling default method of other class within same package--> allowed within package
		Private_Use.display(); //calling protected method of other class within same package-- allowed in same package/need inheritance to call in other package
		
		System.out.println("value of a is "+pu.a);
		System.out.println("value of a is "+pu.c);
		System.out.println("value of a is "+Private_Use.d);
		

	}

}
