package SamplePackage;

public class EncapsTest
{
	private String name;
	private String id;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getId()
	{
		return id; 
	}
	public int getAge()
	{
		return age; 
	}
	public String getName()
	{
		return name; 
	}

	public static void main(String[] args) 
	{
		EncapsTest et=new EncapsTest();
		et.setName("Anees");
		et.setId("1234");
		et.setAge(35);
		System.out.println("Name : "+et.getName());
		System.out.println("Id : "+et.getId());
		System.out.println("Age : "+et.getAge());
	}

}
