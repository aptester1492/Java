package OOPConceptPart1;

public class Car {

	int mod;
	int wheel;

	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2016;
		b.wheel = 4;

		c.mod = 2017;
		c.wheel = 4;
		System.out.println("Before refference");
		System.out.println(a.mod);
		System.out.println(b.mod);
		
		
		System.out.println("After applyinf refference");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=40;
		System.out.println(c.mod);

	}

}
