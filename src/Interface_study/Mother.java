package Interface_study;

public interface Mother 
{
	void nature();
	void look();
	
	default void love()
	{
		System.out.println("Mothers Love");
	}
	
	static void test()
	{
		System.out.println("mothers Test");
	}
}
