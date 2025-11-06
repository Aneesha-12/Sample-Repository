package SamplePackage;

public class ThisReverse {
	int num;
	int rev;
	ThisReverse(int num)
	{
		this.num=num;
		rev=0;
		while(num>0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
		}
	}
	ThisReverse()
	{
		System.out.println("Finding reverse of number");
		
	}
	void display()
	{
		System.out.println("Reverse of "+num+" is : "+rev);
	}
	

	public static void main(String[] args) 
	{	
		ThisReverse ob = new ThisReverse(2345);
		//ThisReverse obj = new ThisReverse();
		ob.display();
		//obj.display();
	}

}
