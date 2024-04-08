package algorithmStudy.sec02;

//°­»ç ´ä
import java.util.*;

public class Q09A {

	public int solution(int[][] arr, int n) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;

			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);

		}
		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - 1 - i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];

		Q09A m = new Q09A();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(m.solution(arr, n));

	}
}
