package algorithmStudy.sec03;

//내 응용 답(강사 답이 더 빠름)
import java.util.*;

public class Q04_2 {

	public int solution(int[] arr, int n, int m) {
		int result = 0, sum = 0;
		int lt = 0, rt = 0;
		while (rt < n) {
			if (sum <= m) {
				sum += arr[rt++];
			} else {
				sum -= arr[lt++];
			}

			if (sum == m)
				result++;

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q04_2 T = new Q04_2();
		System.out.print(T.solution(arr, n, m));
	}
}