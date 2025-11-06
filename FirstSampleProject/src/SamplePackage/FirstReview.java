package SamplePackage;

public class FirstReview {
	public void sum(int a,int b)
	{
		int s=a+b;
		System.out.println("a  = "+a);
		System.out.println("b  = "+b);
		System.out.println("a + b = "+s);
	}

	public static void main(String[] args) 
	{
		FirstReview f = new FirstReview();
		f.sum(15, 5);

	}

}
