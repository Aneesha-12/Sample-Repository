package HierarchicalInheritance;

public class PhoneTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		System.out.println("Details of Apple iphone : ");
		System.out.println("Price : "+a.pr);
		System.out.println("Colour : "+a.col);
		a.capacity();
		Samsung s = new Samsung();
		System.out.println("Details of Samsung : ");
		s.camera();
		System.out.println("Colour : "+s.colour);
		System.out.println("Price : "+s.price);
		s.show();
	}

}
