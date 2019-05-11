package classTest.constructorTest;

public class ConstructorTest {
	ConstructorTest(int a) {
		System.out.println("initialize int " + a);
	}
	
	ConstructorTest(String s) {
		System.out.println("initialize String " + s);
	}
	
	ConstructorTest(int a, String s) {
		this(a);
		//this(s); //invalid
		System.out.println("initialize int and String " + a + " " + s);
	}
	
	public static void main(String[] args) {
		ConstructorTest cTest = new ConstructorTest(1, "asd");
	}
}
