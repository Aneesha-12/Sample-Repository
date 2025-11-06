package SamplePackage;

public class TryCatchSample {

	public static void main(String[] args)
	{
		int a=5;
		int b=0;
		try 
		{
			int c=a/b;
			System.out.println("c : "+c);
		}
		catch(Exception e)
		{
			
			System.out.println("Enter valid number ,Cann't divisible by zero");
		}

	}

}
