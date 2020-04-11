package Recursion;

public class N_queens_problem {
	int [] cols = new int [N + 1];
	boolean queens(int level) // return-type 은 일단 boolean 으로 선언. 즉, 성공이냐 실패냐를 반환한다.
	{
		if(!promising(level)) //현재 노드가 꽝인지 아닌지를 판단(non-promising))
			return false;
		else if (level == N){
		// promising 테스트를 통과했다는 가정하에 level == N 이면 모든 말이 놓였다는 의미이고, 따라서 성공이다.
			for(int i = 1; i <= N; i++)
				System.out.println("(" + i + "," + cols[i] + ")");
			return true;
		}
		for(int i = 1; i <= N; i++){
			cols[level + 1] = i;
			if(queens(level + 1)) return true;
			//level + 1 번째 말을 각각의 열에 놓은 후 recursion 을 호출한다.
		}
		return false;
	}
	private boolean promising(int level) {
		for(int i = 1; i < level; i++) {
			if(cols[i] == cols[level]) //같은 열에 놓였는지 검사
				return false;
			else if (level - i == Math.abs(cols[level] - cols[i])) //같은 대각선에 놓였는지 검사
				return false;
		}
		return true;
	}
}
