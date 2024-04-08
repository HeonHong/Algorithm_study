package algorithmStudy.sec06;

//강사 답
import java.util.Scanner;

public class Q02A {
	public int[] solution(int[] arr) {
		int cnt = 0;
//어차피 맨 뒤 값은 자동으로 변하기 때문에 n-1회차만 순회하면 된다.
		for (int i = 0; i < arr.length - 1; i++) {
//한 회차마다 가장 큰 값, 다음으로 큰 값을 넣는 방식으로 이미 뒤의 값들은 고정되기 때문에 한 회차마다 j의 for문이 한 배열 전체가 아닌 한 값씩 줄여나가면 된다.
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			} // for j
		} // for i

		cnt++;
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q02A m = new Q02A();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
