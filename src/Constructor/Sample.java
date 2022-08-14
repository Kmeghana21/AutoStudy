package Constructor;

public class Sample 
{
	int x;
	int y;			// variable declartion
	
	public Sample()	// user defined constructor
	{
		x=100;
		y=200;
		
	}
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.sub();
		
	}
	public void sub()
	{
		int sub=x-y;
		System.out.println("sub is"+sub);
	}

}
