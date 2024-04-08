package algorithmStudy.sec05;

//강사 답
import java.util.*;

public class Q06A {
	public int solution(int n, int k) {
		int result = 0;
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}

		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++) {
				q.offer(q.poll());// 3명일 경우, 2명까지 넣고 아래서 삭제처리
			}
			q.poll();
			if (q.size() == 1)
				result = q.poll();
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Q06A m = new Q06A();
		System.out.println(m.solution(n, k));
	}
}