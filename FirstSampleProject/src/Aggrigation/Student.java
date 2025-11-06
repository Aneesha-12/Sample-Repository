package Aggrigation;

public class Student {
	String name;
	int id;
	CollageAddress address;
	Student(String name,int id,CollageAddress address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Collage Address : "+address.city +address.state+ address.country);
		
	}

	public static void main(String[] args) 
	{	
		CollageAddress ca=new CollageAddress (" Kochi "," Kerala "," India ");
		Student s1=new Student("Aneesha",101,ca);
		s1.display();
		Student s2=new Student("Anu",102,ca);
		s2.display();
	}

}
