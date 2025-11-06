package SamplePackage;



	class Dog extends Animal{
		 String name;
		 Dog(String name)
		 {
			 this.name=name;
		 }
		void Display()
		 {
			System.out.println("My name is : "+name);
			System.out.println("My height is : "+height);
			System.out.println("My Colour is : "+colour);
		 }
		public static void main(String[] args) {
			Dog d=new Dog("Pinky");
			d.Display();
			d.run();
			}
	 }


