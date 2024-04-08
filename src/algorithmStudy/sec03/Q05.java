package algorithmStudy.sec03;

/*연속된 자연수의 합 
설명
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.
입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
출력
첫 줄에 총 경우수를 출력합니다.
*/
import java.util.Scanner;

public class Q05 {
	public int solution(int n1) {

		int result = 0;
		int limit = (n1 % 2 == 1) ? (n1 / 2) + 1 : n1 / 2;
		for (int i = 1; i <= limit; i++) {
			int temp = 0;
			for (int k = i; k <= limit; k++) {
				temp += k;
				if (temp == n1) {
					result++;
					break;
				} else if (temp > n1) {
					break;
				}
			} // for k
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();

		Q05 m = new Q05();

		System.out.println(m.solution(n1));
	}
}
