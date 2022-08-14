package Interface_study;

public interface Father
{
	void atitude();
	void money();
	
	default void love()
	{
		System.out.println("fathers love");
	}
	
	static void test()
	{
		System.out.println("fathers test");
	}
}
