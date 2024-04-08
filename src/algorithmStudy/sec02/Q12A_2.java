package algorithmStudy.sec02;

//°­»ç ´ä
import java.util.*;

public class Q12A_2 {

	public int solution(int[][] arr, int n) {
		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				} // for k
			} // for j
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		} // fori

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n + 1][6];

		Q12A_2 m = new Q12A_2();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(m.solution(arr, n));

	}
}
