package classTest.constructorTest;

class Fruit {
}

class Apple extends Fruit {
	Apple() {
		System.out.println("create apple, no params");
	}
	
	Apple(String s) {
		System.out.println("create apple, " + s);
	}
}

class RedApple extends Apple {
	RedApple() {
		System.out.println("create red apple, no params");
	}
	
	RedApple(String s) {
		System.out.println("create red apple, " + s);
	}
}

class GreenApple extends Apple {
	GreenApple() {
		System.out.println("create green apple, no params");
	}
	
	GreenApple(String s) {
		super(s);
		System.out.println("create green apple, " + s);
	}
}

class Pear extends Fruit {
	Pear(String s) {
		System.out.println("create pear, " + s);
	}
}

class YellowPear extends Pear {
	YellowPear(String s) {
		super(s);
	}
}

public class InheritanceConstructorTest {
	public static void main(String[] args) {
		new RedApple();
		new RedApple("hongfushi");
		System.out.println();
		new GreenApple();
		new GreenApple("lvfushi");
	}
}
