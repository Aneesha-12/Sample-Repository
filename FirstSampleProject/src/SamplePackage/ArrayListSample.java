package SamplePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListSample {

	public static void main(String[] args) 
	{
		ArrayList<String> fruits =new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Kiwi");
		
		System.out.println("List of Fruits " +fruits);
		fruits.add(1,"Banana");
		System.out.println("List of Fruits " +fruits);
		System.out.println("2 nd Index fruit is : "+fruits.get(2));
		fruits.set(2, "Grapes");
		fruits.add(0,"Guvava");
		System.out.println("List of Fruits " +fruits);
		Iterator<String> it=fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(fruits.remove(3));
		System.out.println("Size of list "+fruits.size());
		Collections.sort(fruits);
		for(String f:fruits)
		{
			System.out.println(f);
		}
		
		//for(int i=0;i<fruits.size();i++)
		//{
		//	System.out.println(fruits.get(i));
		//}
		//System.out.println("List of Fruits " +fruits);
		//fruits.clear();
		//System.out.println("List of Fruits " +fruits);
	}

}
