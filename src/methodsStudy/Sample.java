package methodsStudy;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("main method is running");
			demo();		/*static method call from same class
			 			to call static method from same class--> directly
			 			call static method i.e. methodname()*/
	}
	public static void demo() //defining static method
	{
		System.out.println("hi i'm demo method from sample class");
	}

}
