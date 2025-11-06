package AbstractionSample;

public class Contractors extends Employee
{
	public void calculateSalary()
	{
		int h=8;
		int salary=500*h;
		System.out.println("Salary : "+salary);
	}
	public void display(String name,int age)
	{
		System.out.println("Name : "+name );
		System.out.println("Age : "+age);
	}



}
