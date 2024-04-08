package algorithmStudy.sec05;

//���� ��
import java.util.*;

public class Q05A {
	public int solution(String str) {
		int result = 0;
		Stack<Character> stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				stack.push('(');
			else {
				stack.pop();
				if (str.charAt(i - 1) == '(')
					result += stack.size();
				else
					result++; // ���� ������ �ϳ����� ���ָ� ��.
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q05A m = new Q05A();
		System.out.println(m.solution(str));

	}
}