package algorithmStudy.sec08;

import java.util.*;

public class Q01A {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;

	public void DFS(int L, int sum, int[] arr) {
		if (flag)
			return;
		if (sum > total / 2)
			return;
		if (L == n) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		Q01A T = new Q01A();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

}
