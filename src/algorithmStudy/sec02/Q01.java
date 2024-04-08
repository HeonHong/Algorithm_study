package algorithmStudy.sec02;

/*큰 수 출력하기
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

내 답
알아야 할 것.
숫자 배열은 값이 비었으면 null이 아니라 0이 된다.*/
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] num, int n) {
		int[] result = new int[n];
		result[0] = num[0];
		for (int i = 1; i < n; i++) {
			if (num[i - 1] < num[i]) {
				result[i] = num[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = in.nextInt();
		}
		Q01 m = new Q01();
		for (int r : m.solution(num, n)) {
			if (r != 0)
				System.out.print(r + " ");
		}

	}
}