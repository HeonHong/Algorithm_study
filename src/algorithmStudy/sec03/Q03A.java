package algorithmStudy.sec03;

//°­»ç ´ä
import java.util.*;

public class Q03A {

	public int solution(int[] a, int n, int m) {
		int result = 0, sum = 0;

		for (int i = 0; i < m; i++)
			sum += a[i];
		result = sum;

		for (int i = m; i < n; i++) {
			sum += (a[i] - a[i - m]);
			result = Math.max(result, sum);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Q03A T = new Q03A();
		System.out.print(T.solution(a, n, m));
	}
}