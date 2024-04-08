package algorithmStudy.sec03;

//°­»ç´ä
import java.util.*;

public class Q01A {

	public ArrayList<Integer> solution(int[] a, int[] b, int n, int m) {
		ArrayList<Integer> result = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2]) {
				result.add(a[p1++]);
			} else {
				result.add(b[p2++]);
			}
		} // while

		while (p1 < n) {
			result.add(a[p1++]);
		}

		while (p2 < m) {
			result.add(b[p2++]);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		Q01A T = new Q01A();
		for (int x : T.solution(a, b, n, m))
			System.out.print(x + " ");
	}
}