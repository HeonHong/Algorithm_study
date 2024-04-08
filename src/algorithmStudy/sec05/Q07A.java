package algorithmStudy.sec05;

//강사 답
import java.util.*;

public class Q07A {
	public String solution(String need, String plan) {
		String result = "YES";
		Queue<Character> q = new LinkedList<>();

		for (char x : need.toCharArray()) {
			q.offer(x);
		}
		for (char x : plan.toCharArray()) {
			if (q.contains(x)) {
				if (x != q.poll())
					return "NO";
				// 만약에 q ABC
				// 이수 과목이 BABC면 NO가 나오게 되서 이건 잘못된 코드임.
				// 채점 시, 문제가 잘못되어있어서 답으로 가능한 케이스임.
			}
		}
		if (!q.isEmpty())
			return "NO";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String str2 = in.next();
		Q07A m = new Q07A();
		System.out.println(m.solution(str, str2));
	}
}
