package classTest.initializeOrderTest;

class B {
	B(int marker) {
		System.out.println("B " + marker);
	}
}

public class SupportClass {
	static B b1 = new B(1);
	
	SupportClass(int marker) {
		System.out.println("SupportClass " + marker);
	}
}
