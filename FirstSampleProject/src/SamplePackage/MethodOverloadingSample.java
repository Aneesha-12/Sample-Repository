package SamplePackage;

public class MethodOverloadingSample {

	public static void add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Add two integer numbers");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("a+b = "+c);
	}
	public static void add(float p,float q,float r) {
		float f =p+q+r;
		System.out.println("Add three floating point numbers");
		System.out.println("p = "+p);
		System.out.println("q = "+q);
		System.out.println("r = "+r);
		System.out.println("p+q+r = "+f);
	}
	public static void main(String[] args) {
		add(10,16);
		add(22.1f,13.7f,3.2f);
		
	}

}
