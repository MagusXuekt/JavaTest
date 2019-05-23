package classTest.polymorphismTest;

class Fruit {
	private String name = "Fruit";
	public int number = 999;
	
	Fruit(String s, int n) {
		System.out.println("create fruit " + number + " " + name);
		number = n;
		name = s;
		bury();
	}
	
	public void cut() {
		System.out.println("cut fruit " + number + " " + name);
	}
	
	public void eat() {
		System.out.println("eat fruit " + number + " " + name);
	}
	
	private void bury() {
		System.out.println("bury fruit " + number + " " + name);
	}
}

class Apple extends Fruit {
	private String name = "apple";
	public int number = 888;
	
	Apple(String s, int n) {
		super(s, n);
		System.out.println("create apple " + number + " " + name);
		name = s;
		number = n;
		bury();
		plant();
	}
	
	public void cut() {
		System.out.println("cut apple " + number + " " + name);
	}
	
	public void eat() {
		System.out.println("eat apple " + number + " " + name);
	}
	
	public void bury() {
		System.out.println("bury apple " + number + " " + name);
	}
	
	public void plant() {
		System.out.println("plant apple " + number + " " + name);
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		Apple test1 = new Apple("test1", 1);
		test1.cut();
		System.out.println();
		//Apple test2 = (Apple)new Fruit("test2", 2);
		Fruit test3 = new Apple("test3", 3);
		test3.cut();
		System.out.println();
		Fruit temp = new Apple("test4", 4);
		Apple test4 = (Apple)temp;
		test4.cut();
		test4.plant();
	}
}
