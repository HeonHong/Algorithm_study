package algorithmStudy.sec01;

import java.util.Scanner;
/*��ȿ�� �Ӹ����
����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
���ĺ� �̿��� ���ڵ��� �����մϴ�.

�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.

���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.*/
public class Q08A {
	public String solution(String str) {
		String result = "YES";
		String s = str.toUpperCase().replaceAll("[^A-Z]", "");// replace���� ���Խ� �Ұ�
		String tmp = new StringBuilder(s).reverse().toString();
		if (!s.equals(tmp))
			result = "NO";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Q08A m = new Q08A();
		System.out.println(m.solution(str));
	}
}
