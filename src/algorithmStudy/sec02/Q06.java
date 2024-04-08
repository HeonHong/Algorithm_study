package algorithmStudy.sec02;

/*뒤집은 소수 
설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
*/
//내 답
import java.util.Scanner;

public class Q06 {
	public void solution(int[] a, int num) {
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			int temp = Integer.parseInt(new StringBuilder(String.valueOf(a[i])).reverse().toString());
			for (int j = 2; j < temp; j++) {
				if (temp == 2) {
					break;
				}
				if (temp % j == 0) {
					cnt = 1;
					break;
				}
			}
			if (cnt == 0 && temp != 1)
				System.out.print(temp + " ");
			cnt = 0;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = in.nextInt();
		}
		Q06 m = new Q06();

		m.solution(a, num);

	}
}