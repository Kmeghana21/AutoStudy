package CollectionStudy;

import java.util.ArrayList;

public class ArrayListStudty
{
	
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		
		al.add("Meghana");
		al.add(2016);
		al.add(15.45);
		al.add("ABC");
		al.add("Meghana");
		al.add(true);
		al.add('A');
		al.add("Meghana");
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(4));
		
		System.out.println(al.contains("Prajkta"));
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf(6));
		
		System.out.println(al.remove(0));
		System.out.println(al.IndexOf("ABC",3));								
		System.out.println("****************************************");
		/*for(int i=0;i<al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}*/
		
		
	}

}
