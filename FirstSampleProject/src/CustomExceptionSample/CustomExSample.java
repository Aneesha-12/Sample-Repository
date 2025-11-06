package CustomExceptionSample;

public class CustomExSample {
	static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Access denied");
		}
		else
		{
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		try
		{
			checkAge(22);
		}
		catch(InvalidAgeException ia)
		{
			System.out.println("Message : "+ia.getMessage());
		}
		
	}

}
