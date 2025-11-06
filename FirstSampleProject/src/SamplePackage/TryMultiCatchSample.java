package SamplePackage;

public class TryMultiCatchSample {

	public static void main(String[] args) 
	{
		try
		{
			int num[]= {1,2,3,4};
			int result=num[5]/2;
			System.out.println(result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught Arithmetic Exception : cann't divisible by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
			System.out.println(ai.getMessage());
			System.out.println("Caught Array index out of bound exception");
		}
		finally
		{
			System.out.println("finally block always execute");
		}
	}

}
