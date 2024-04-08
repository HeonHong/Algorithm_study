package algorithmStudy.sec02;

//°­»ç´ä
import java.util.*;

public class Q07A {

	public int solution(int[] arr, int n) {
		int answer = 0, cnt = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else
				cnt = 0;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		Q07A m = new Q07A();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(m.solution(arr, n));

	}
}