package Sorting;
/*
 * p ~ q, q + 1 ~ r 까지의 배열은 이미 정렬되어 있다고 가정한다.
 */
public class MergeSort {
	void merge(int data[], int p, int q, int r) {
		int i = p, j = q + 1, k = p;
		int tmp[] = new int[data.length];
		while(i <= q && j <= r) { //각 배열에서 아직 비교해야 할 데이터가 남아있는 경우
			if(data[i] <= data[j])
				tmp[k++] = data[i++];
			else
				tmp[k++] = data[j++];
		} //둘 중 어느 한곳이 비교할 원소가 없어지면 while 문 빠져나옴
		while(i <= q) //각 배열에서 아직 삽입할 원소가 남아 있는 경우
			tmp[k++] = data[i++];
		while(j <= r) //각 배열에서 아직 삽입할 원소가 남아 있는 경우
			tmp[k++] = data[j++];
		for(i = p; i <= r; i++) //합병이 끝난 tmp배열의 값들을 모두 data 배열에 삽입
			data[i] = tmp[i];
	}
}
