package superKeyWord;

public class ParentClass {
	int age = 30;
	ParentClass(String name)
	{
		System.out.println("Name : "+name);
		System.out.println("Parent class constructor involked");
	}
	void show(int a,int b)
	{
		System.out.println("Parent show method invoked");
		int c=a+b;
		System.out.println(a+" + "+b +" = " +c);
	}

}
