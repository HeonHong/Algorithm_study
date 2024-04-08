package algorithmStudy.sec05;

/*������ ����(postfix) (���� ���� �� �ϰ� Ǯ ��!!!)
����
����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.
�Է�
ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.
���
������ ����� ����մϴ�.*/

import java.util.*;

public class Q04 {
	public int solution(String str) {
		Stack<Integer> st = new Stack();
		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) {
				st.push((int) x - 48);
			} else {
				if (x == '+')
					st.push(st.pop() + st.pop());
				if (x == '-')
					st.push(-st.pop() + st.pop());
				if (x == '*')
					st.push(st.pop() * st.pop());
				if (x == '/')
					st.push(1 / st.pop() * st.pop());
			}
		}
		return st.pop();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();

		Q04 t = new Q04();
		System.out.print(t.solution(str));

	}
}