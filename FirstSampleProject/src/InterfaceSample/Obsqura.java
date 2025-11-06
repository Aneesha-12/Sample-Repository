package InterfaceSample;

public class Obsqura implements Office,Office1{
	public void work() 
	{
		System.out.println("Employees work");
	}
	public void teach() 
	{
		System.out.println("Teachers work");
	}
	public void marketing()
	{
		System.out.println("Marketing staff work");
	}
	
	public static void main(String arg[])
	{
		Obsqura o=new Obsqura();
		o.work();
		o.teach();
		o.marketing();
		
	}

}
