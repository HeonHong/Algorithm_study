package algorithmStudy.sec03;

//강사답
import java.util.*;

public class Q05A {

	public int solution(int n) {
		int result = 0, sum = 0;
		int lt = 0, m = n / 2 + 1;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++)
			arr[i] = i + 1;

		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if (sum == n)
				result++;
			while (sum > n) {
				sum -= arr[lt++];// 이거 자꾸 lt--로 실수하지 말 것!!!!!
				if (sum == n)
					result++;
			} // while
		} // for

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q05A T = new Q05A();
		System.out.print(T.solution(n));
	}
}
