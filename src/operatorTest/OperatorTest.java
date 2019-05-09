package operatorTest;

public class OperatorTest {
	public static void modTest() {
		int op1 = 10;
		double op2 = 3.3;
		System.out.println(op1 + " mod " + op2 + " = " + op1 % op2);
		System.out.println(op2 + " mod " + op1 + " = " + op2 % op1);
	}
	
	public static void main(String[] args) {
		modTest();
	}
}
