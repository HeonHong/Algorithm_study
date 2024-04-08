package algorithmStudy.sec03;

/*최대 매출 (Sliding Window)
설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 15 11 20 2510 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.
입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
출력
첫 줄에 최대 매출액을 출력합니다.*/
//내 답
import java.util.Scanner;

public class Q03 {
	public int solution(int[] arr, int n1, int n2) {

		int result = Integer.MIN_VALUE;
		int tmp = 0;

		for (int i = 0; i < n1 - n2; i++) {
			if (i == 0) {
				for (int k = i; k < i + n2; k++) {
					tmp += arr[k];
				} // for k
			} // if
			else {
				tmp = tmp - arr[i - 1] + arr[i + n2 - 1];
			}
			result = Math.max(tmp, result);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[] arr = new int[n1];

		for (int i = 0; i < n1; i++) {
			arr[i] = in.nextInt();
		}

		Q03 m = new Q03();

		System.out.println(m.solution(arr, n1, n2));
	}
}