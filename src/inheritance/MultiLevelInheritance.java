package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args)
	{
		Son s= new Son();	//created objects of son class
		s.recipe();			// calling non static method
		s.nature();
		s.mobile();
		
		Son.stories();
		Son.look();
		Son.laptop();
		
		Mother m= new Mother();
		m.recipe();
		m.nature();
	}

}
