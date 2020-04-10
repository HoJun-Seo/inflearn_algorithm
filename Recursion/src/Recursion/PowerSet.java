package Recursion;
/*
 * data[k] , ..... , data[n - 1] 의 멱집합을 구한 후 각각에 include[i] = true, 
 * i = 0, ..... , k - 1 인 원소를 추가하여 출력하라.
 * 
 * 처음 이 함수를 호출 할 때는 powerSet(0) 로 호출한다. 즉, P는 공집합이고 S는 전체집합이다.
 */
public class PowerSet {
	private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n = data.length;
	private static boolean[] include = new boolean[n];
	
	public static void powerSet(int k) {
		if(k == n) { //내 위치가 리프노드 일 경우
			for(int i = 0; i < n; i++)
				if(include[i]) System.out.println(data[i] + " "); //include 배열의 요소가 true 인 경우만 출력
			System.out.println();
			return;
		}
		include[k] = false;
		powerSet(k + 1); //먼저 왼쪽으로 내려갔다가
		//data[k] 를 포함하지 않는 경우(부분 집합의 첫 번째 원소)
		include[k] = true;
		powerSet(k + 1); //이번엔 오른쪽으로 내려간다.
		//data[k] 를 포함하는 경우
	}
}
