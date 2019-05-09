package controlBlockTest;

public class ControlBlockTest {
	public static void forTest() {
		int i = 1;
		for(; i < 3; ++ i) {
			System.out.println(i);
			if(i == 2) break;
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		forTest();
	}
}
