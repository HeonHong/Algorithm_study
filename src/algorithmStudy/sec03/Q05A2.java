package algorithmStudy.sec03;

//다른 방식
import java.util.*;

public class Q05A2 {

	public int solution(int n) {
		int result = 0, cnt = 1;
		n--;
		while (n > 0) {
			cnt++;
			n = n - cnt;
			if (n % cnt == 0)
				result++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q05A2 T = new Q05A2();
		System.out.print(T.solution(n));
	}
}