package Recursion;
/*
 * PATH_COLOR : visited 이며 아직 출구로 가는 경로가 될 가능성이 있는 cell
 * BLOCKED_COLOR : visited 이며 출구까지의 경로상에 있지 않음이 밝혀진 cell
 */
public class Maze {
	private static int N = 8;
	private static int [][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0,}
	};
	
	private static final int PATHWAY_COLOUR = 0; // white
	private static final int WALL_COLOUR = 1; //blue
	private static final int BLOCKED_COLOUR = 2; //red : 방문 했지만 막 다른길이다.(출구까지 가는 길이 없음)
	private static final int PATH_COLOUR = 3; //green : 방문한 곳이지만 출구까지 가는 길이 있을지 없을지 모른다.(아니라는게 밝혀지면 붉은색으로 색칠한다.
	
	public static boolean findMazePath(int x, int y) { //(x,y) 에서 부터 출구까지 가는 경로가 있는지 검사하는 함수
		if(x < 0 || y < 0 || x >= N || y >= N) return false; // 재귀 호출 시 좌표가 음수가 되는 경우를 체크한다.(미로 범위에 유효한 범위 인지를 체크)
		else if(maze[x][y] != PATHWAY_COLOUR) return false; //green 이거나 red, 또는 blue 인 경우 
		else if(x == N - 1 && y == N - 1) { //현재 위치가 출구인 경우
			maze[x][y] = PATH_COLOUR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOUR; //green 으로 색칠
			if(findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1)) { //현재 좌표에선 인접한 4개의 셀 검증
				//넷 중 하나라도 true 라면(경로가 찾아짐) true return
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR; //이 위치에서 어떤 방향으로 가더라도 이미 지나온 셀을 지나지 않고서는 출구까지 가는 경로가 없다는 뜻(이 자리는 꽝이다.)
			return false;
		}
	}
	
	public static void main(String[] args) {
		printMaze();
		findMazePath(0, 0);
		System.out.println();
		printMaze();
	}

	public static void printMaze() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	
}
