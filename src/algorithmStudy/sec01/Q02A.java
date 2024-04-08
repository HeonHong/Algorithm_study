package algorithmStudy.sec01;

//�����
import java.util.Scanner;

public class Q02A {
	public String solution(String str) {
		String result = "";
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x))
				result += Character.toUpperCase(x);
			else
				result += Character.toLowerCase(x);

			// �ƽ�Ű�ڵ� �̿��� ���
			// �빮�� 65~90
			// �ҹ��� 97~122
			// ���� 48~57
			if (x >= 65 && x <= 90)
				result += (char) (x + 32);
			else
				result += (char) (x - 32);

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		Q02A m = new Q02A();

		System.out.println(m.solution(input1));
	}
}