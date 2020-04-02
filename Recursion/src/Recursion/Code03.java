package Recursion;

public class Code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}

	public static int func(int n) { //리턴값을 돌려주는 recursion method
		if(n <= 0) return 0;
		else {
			return n + func(n - 1); //1 ~ n 까지의 합을 구한다.
		}
		
	}
}
