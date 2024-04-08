package algorithmStudy.sec06;

import java.util.*;

//강사 답(정렬로 풀기)
public class Q05A {
	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return "D";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Q05A m = new Q05A();
		System.out.println(m.solution(n, arr));
	}
}
