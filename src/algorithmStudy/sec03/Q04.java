package algorithmStudy.sec03;

import java.util.Scanner;

/*연속 부분수열
설명
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.
출력
첫째 줄에 경우의 수를 출력한다.*/

//내 답
public class Q04 {
	public int solution(int[] arr, int n1, int n2) {

		int result = 0;
		boolean isTrue = false;

		for (int i = 0; i < n1; i++) {
			int tmp = 0;

			for (int k = i; k < n1; k++) {
				tmp += arr[k];
				if (tmp == n2) {
					isTrue = true;
					break;
				} else if (tmp > n2) {
					break;
				}
			} // for k

			if (isTrue) {
				result++;
			}

			isTrue = false;
		} // for i

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

		Q04 m = new Q04();

		System.out.println(m.solution(arr, n1, n2));
	}
}