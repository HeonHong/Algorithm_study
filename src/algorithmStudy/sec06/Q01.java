package algorithmStudy.sec06;

/*선택 정렬
요약
배열의 전체 순회를 반복적으로 하여 가장 작은 값을 맨 앞에 넣어주고 해당 배열을 검토 대상에서 제외시켜 검토대상을 하나씩 줄여나가는 정렬 방식이다. 
설명
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 선택정렬입니다.
입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
*/

//내 답
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];// 강사 답 참고하면 이거 굳이 사용할 필요 없음. idx만 사용하면됨.
			int idx = 0;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			} // for j

			if (arr[i] > min) {
				arr[idx] = arr[i];
				arr[i] = min;
			}
		} // for i
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q01 m = new Q01();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
