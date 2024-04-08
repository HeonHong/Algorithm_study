package algorithmStudy.sec06;

/*삽입 정렬 4분
요약
검토 대상을 하나씩 늘려가면서 순회하여 검토 대상의 맨 뒤 값이 자신보다 작은 값 뒤에 삽입시키는 정렬 방식이다.
설명
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 삽입정렬입니다.
입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
출력
오름차순으로 정렬된 수열을 출력합니다.*/
import java.util.Scanner;

//내 답
public class Q03 {
	public int[] solution(int[] arr) {
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			} // for j
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
		Q03 m = new Q03();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
