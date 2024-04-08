package algorithmStudy.sec06;

//강사 답
import java.util.Scanner;

public class Q01A {
	public int[] solution(int[] arr) {
		// 어차피 안에 있는 for문 때문에 맨 끝은 가장 큰 값이 간다.
		for (int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			// 맨 뒤까지 검색해야 한다!!
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[idx] > arr[j]) {
					idx = j;
				}
			} // for j
			if (arr[idx] != arr[i]) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
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
		Q01A m = new Q01A();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
