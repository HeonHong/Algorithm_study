package algorithmStudy.sec05;

//���� ��
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
				// ���࿡ q ABC
				// �̼� ������ BABC�� NO�� ������ �Ǽ� �̰� �߸��� �ڵ���.
				// ä�� ��, ������ �߸��Ǿ��־ ������ ������ ���̽���.
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
