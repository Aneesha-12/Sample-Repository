package SamplePackage;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) 
	{
		Set<String> colours=new HashSet<>();
		colours.add("green");
		colours.add("green");
		colours.add("blue");
		colours.add("red");
		System.out.println("colours1 is : "+colours);
		System.out.println("Size of Colour1 " +colours.size());
		colours.remove("blue");
		System.out.println("After Remove blue from colour1 : " +colours);
		System.out.println("Is green is present in colours1 : "+colours.contains("green"));
		Set<String> colours2=new HashSet<>();
		colours2.add("pink");
		colours2.add("blue");
		System.out.println("Colour2 is : "+colours2);
		colours.addAll(colours2);
		System.out.println("After adding colour1 and colour2 : "+colours);
		System.out.println("Colours1 is empty : "+colours.isEmpty());
		System.out.println("Common element : "+colours.retainAll(colours2));
		System.out.println("Colour2 is present in colour1 : "+colours.containsAll(colours2));
		System.out.println("Remove colour2 from colour1 : "+colours.removeAll(colours2));
		
		
	}

}
