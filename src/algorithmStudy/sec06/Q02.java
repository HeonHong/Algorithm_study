package algorithmStudy.sec06;
/*버블 정렬 6분
요약 
오름차순 정렬이라고 가정할 때, 인접한 두 값을 비교해서 큰 값을 뒤로 보내면서 검토 대상을 하나씩 줄여나가는 정렬 방법이다.
설명
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 버블정렬입니다.
입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
출력
오름차순으로 정렬된 수열을 출력합니다.*/

//내 답
import java.util.Scanner;

public class Q02 {
	public int[] solution(int[] arr) {
		int cnt = 0;
		while (cnt < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} // for i

			cnt++;
		} // while
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q02 m = new Q02();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}