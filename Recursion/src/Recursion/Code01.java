package Recursion;

public class Code01 {
	public static void main(String[] args) {
		func();
	}

	public static void func() { //재귀(Recursion) method 호출
		System.out.println("Hello...");
		func(); //무한 루프에 빠진다.
		
	}
	
}
