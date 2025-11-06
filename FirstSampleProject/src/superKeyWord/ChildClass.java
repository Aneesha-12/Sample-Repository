package superKeyWord;

public class ChildClass extends ParentClass {
	ChildClass()
	{
		super("Aneesha");
		System.out.println("Child class constructor involked");
	}
	public void show()
	{
		super.show(8,2);
		System.out.println("Child class method involked");
		System.out.println("Age = "+super.age);
	}

	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.show();

	}

}
