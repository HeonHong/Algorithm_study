package algorithmStudy.sec03;

//°­»ç ´ä
import java.util.*;

public class Q04A {

	public int solution(int[] arr, int n, int m) {
		int result = 0, sum = 0;
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if (sum == m) {
				result++;
			}
			while (sum >= m) {
				sum -= arr[lt++];
				if (sum == m) {
					result++;
				}
			} // while
		} // for

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
		Q04A T = new Q04A();
		System.out.print(T.solution(arr, n, m));
	}
}
