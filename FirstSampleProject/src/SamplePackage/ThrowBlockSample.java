package SamplePackage;

public class ThrowBlockSample
{
	static void checkAge(int age)
	{
		if(age>18)
		{
			throw new ArithmeticException("you must be 18 or older");
		}
		else
		{
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args)
	{
		try
		{
			checkAge(20);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Message : "+e.getMessage());
		}
	}

}
