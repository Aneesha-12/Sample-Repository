package MultiLevelInheritanceSample;

public class Bmw extends Car{
	public void acOn() {
		System.out.println("Ac on");
	}

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.acOn();
		b.musicOn();
		b.start();
		System.out.println(b.model);
		System.out.println(b.price);

	}

}
