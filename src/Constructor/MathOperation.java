package Constructor;

public class MathOperation 
{
	int a;	//variable declaration
	int b;
	
	public MathOperation()	//user defined constructor
	{
		System.out.println("Running user defined constructor");
		a=50;
		b=50;
	}
	public void add()
	{
		a=20;		//assign value(inti)
		b=30;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args) 
	{
		MathOperation mo= new MathOperation();
		mo.add();

	}

}
