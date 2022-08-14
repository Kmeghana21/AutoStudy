package inheritance;

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		Mother m = new Mother();	//created objects of mother class
		
		Son s = new Son();		//created objects of son class
		
		m.nature();		//using mothers objects calling mothers method
		s.mobile();
		s.nature();
		
		Mother.look(); 		//mother calling its own static methods
		Son.laptop(); 		//son calling its own static methods
		Son.look(); 		//son calling mothers static methods
		
	}

}
