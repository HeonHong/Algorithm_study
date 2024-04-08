package algorithmStudy.sec05;
/*�ùٸ� ��ȣ 
����
��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
�Է�
ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
���
ù ��° �ٿ� YES, NO�� ����Ѵ�.*/

//�� ��
import java.util.*;

public class Q01 {
	public String solution(String str) {
		String result = "YES";
		Stack st = new Stack();

		if (str.charAt(str.length() - 1) == '(' || str.charAt(0) == ')' || str.length() % 2 == 1)
			return "NO";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				st.push('(');
			else if (st.empty() && str.charAt(i) == ')')
				return "NO";
			else if (str.charAt(i) == ')')
				st.pop();
		}
		if (!st.empty())
			return "NO";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q01 m = new Q01();
		System.out.println(m.solution(str));
	}
}
