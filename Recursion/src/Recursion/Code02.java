package Recursion;

public class Code02 {
	public static void main(String[] args) {
		int n = 4;
		func(n);
	}

	public static void func(int k) { //무한 루프에 빠지지 않는 recursion method
		if(k <= 0) return; //이전에 해당 메소드를 실행시킨 재귀 메소드로 연달아서 돌아가는 방식으로 메소드에서 빠져나온다.
		//base case : 무한 루프에 빠지지 않게 하려면 적어도 하나의 recursion 에 빠지지 않는 경우가 존재해야 한다.
		else {
			System.out.println("Hello");
			func(k-1); // recursion case : recursion 을 반복하다 보면 결국 base case 로 수렴해야 한다.
			//해당 메소드의 경우 -1 이 아니라 +1 이 된다면 무한 루프에 빠지게 되어 오류가 발생한다.
		}
		
	}
}
