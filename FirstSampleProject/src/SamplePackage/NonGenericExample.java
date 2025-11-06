package SamplePackage;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericExample {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Apple");
		list.add(25);
		list.add(12.5);
		list.add(true);
		list.add("Banana");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
