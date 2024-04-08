package algorithmStudy.sec03;

//강사답
import java.util.*;

public class Q02A {

	public ArrayList<Integer> solution(int[] a, int[] b, int n, int m) {
		ArrayList<Integer> result = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;
		Arrays.sort(a);// 정렬 함수
		Arrays.sort(b);
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2]) {
				p1++;
			} else if (a[p1] == b[p2]) {
				result.add(a[p1++]);
				p2++;
			} else {
				p2++;
			}
		} // while

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
		Q02A T = new Q02A();
		for (int x : T.solution(a, b, n, m))
			System.out.print(x + " ");
	}
}
