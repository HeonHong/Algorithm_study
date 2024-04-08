package algorithmStudy.sec05;

/*��ȣ��������
����
�Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
*/

//�� ��
import java.util.*;

public class Q02 {
	public String solution(String str) {
		String result = "";
		Stack st = new Stack();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				while ((char) st.peek() != '(')
					st.pop();
				st.pop();
			} else {
				st.push(str.charAt(i));
			}
		}
		while (!st.empty()) {
			result += st.pop();
		}

		return new StringBuilder(result).reverse().toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q02 m = new Q02();

		System.out.print(m.solution(str));

	}
}