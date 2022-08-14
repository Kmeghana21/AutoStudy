package Constructor;

public class Test
{
	/*public Test()
	 * {
	 *default constructor-->compiler will create at time compilation
	 * }
	 */
	
	public Test()//user defined constructor-->without parameter/with zero parameter
	{
		System.out.println("This is user defined parameter");
	}
	public static void main(String[] args) {
		Test t=new Test(); //created object of class
		
	}
}