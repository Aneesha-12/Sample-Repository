package SamplePackage;

public class ThrowsExample 
{
	static void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied");
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
			checkAge(15);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Message : "+e.getMessage());
		}

	}

}
