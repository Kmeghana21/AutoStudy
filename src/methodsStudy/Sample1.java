package methodsStudy;


public class Sample1 {
		
		public static void demo2()		//defining static method
		{
			System.out.println("hi i am demo 2 from sample1");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("main method from sample1");
			demo1();				//static method call from same class
									//demo2();
									//classname.methodname--> to call static method from another class
			Sample.demo();			// calling static method demo1() from sample class
	}
		public static void demo1()	//defining static method
		{
			System.out.println("hi am demo1 from sample1");
		}
		
}
