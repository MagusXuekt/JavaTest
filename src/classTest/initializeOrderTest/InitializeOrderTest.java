package classTest.initializeOrderTest;

class A {
	A(int marker) {
		System.out.println("A " + marker);
	}
}

class C {
	static {
		System.out.println("static zone of class C");
	}
}

class Super {
	static {
		System.out.println("super static zone");
	}
	
	{
		System.out.println("super normal zone");
	}
	
	Super() {
		System.out.println("Super blablabla");
	}
}

public class InitializeOrderTest extends Super {
	int test1 = 1;
	int test2;
	A a1 = new A(1);
	A a2;
	SupportClass sc1 = new SupportClass(1);
	SupportClass sc2;
	{
		System.out.println("normal zone1");
	}
	
	static int test3 = 3;
	static int test4;
	static A a3 = new A(3);
	static A a4;
	static SupportClass sc3 = new SupportClass(3);
	static SupportClass sc4;
	static {
		System.out.println("static zone1");
	}
	
	int test5 = 5;
	int test6;
	A a5 = new A(5);
	A a6;
	SupportClass sc5 = new SupportClass(5);
	SupportClass sc6;
	{
		System.out.println("normal zone2");
	}
	
	static int test7 = 7;
	static int test8;
	static A a7 = new A(7);
	static A a8;
	static SupportClass sc7 = new SupportClass(7);
	static SupportClass sc8;
	static {
		System.out.println("static zone2");
	}
	
	InitializeOrderTest() {
		System.out.println("InitializeOrderTest Constructor");
	}
	
//	public static void main(String[] args) {
//		System.out.println("Start Test Now!");
//		new InitializeOrderTest();
//	}
}
