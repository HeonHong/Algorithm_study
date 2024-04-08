package algorithmStudy.sec03;

//내 새로운 답
import java.util.*;

public class Q05_2 {

	public int solution(int n) {
		int result = 0, sum = 0;
		int lt = 0, rt = 0;
		while (rt <= ((n / 2) + 2)) {
			// 등호 들어가는 게 중요함
			// n이 19일 때 10까지 더하고 11로 넘어간 다음 홀드 된다.
			// 이후 lt를 빼야하는데 ((n/2)+1)일 경우 11이니까 빼지 않고 끝나게 됨.
			// 강사처럼 for문 안에 lt 값을 적용하는 while문을 만드는 것이 낫다.
			if (sum <= n) {
				sum += rt++;

			} else {
				sum -= lt++;

			}
			if (sum == n)
				result++;

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q05_2 T = new Q05_2();
		System.out.print(T.solution(n));
	}
}