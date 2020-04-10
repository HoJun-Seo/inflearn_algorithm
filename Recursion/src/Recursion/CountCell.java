package Recursion;

public class CountCell {
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	
	public int countCells(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) return 0; //이미지 파일은 N x N 크기 이다.
		else if(grid[x][y] != IMAGE_COLOR) return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1)
				   + countCells(x + 1, y + 1) + countCells(x - 1, y)
				   + countCells(x + 1, y) + countCells(x - 1, y - 1)
				   + countCells(x, y - 1) + countCells(x + 1, y - 1);
		}
	}
	
}
/*
 *입력 : 
N x N 크기의 2차원 그리드(grid)
하나의 좌표(x,y)

출력 :
픽셀(x,y) 가 포함된 blob의 크기
(x,y) 가 어떤 blob 에도 속하지 않는 경우에는 0

Recursive Thinking
현재 픽셀이 속한 blob 의 크기를 카운트하려면
- 현재 픽셀이 image color 가 아니라면 0 을 반환한다.(base case)
- 현재 픽셀이 image color 라면 먼저 현재 픽셀을 카운트 한다.(count = 1)
- 현재 픽셀이 중복 카운트 되는 것을 방지하기 위해 다른 색으로 칠한다.
- 현재 픽셀에 이웃한 모든 픽셀(북->북동->동->동남.....시계방향으로 읽어들인다.)들에 대해서 그 픽셀이 속한 blob 의 크기를 카운트하여 카운터에 더해준다.
- 카운터를 반환한다. 
 */
