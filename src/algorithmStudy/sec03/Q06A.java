package algorithmStudy.sec03;

//°­»ç ´ä
import java.util.*;

public class Q06A {

	public int solution(int n, int k, int[] arr) {
		int result = 0, cnt = 0, lt = 0;

		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0)
				cnt++;

			while (cnt > k) {
				if (arr[lt] == 0)
					cnt--;
				lt++;
			}

			result = Math.max(result, rt - lt + 1);
		} // for rt
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q06A T = new Q06A();
		System.out.print(T.solution(n, k, arr));
	}
}
