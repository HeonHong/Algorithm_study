package algorithmStudy.sec01;

/*���ڸ� ����
����
���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.

�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

���
ù �ٿ� �ڿ����� ����մϴ�.
*/
//�� ��
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		// uppercase�� ����
		// 65~92�Ÿ���
		// parseInt�� ���ڷ� �����ؼ� 100,000,000 �������� Ȯ��
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		char[] chArr = input1.toCharArray();
		int cnt = 0;
		String result = "";
		for (int i = 0; i < input1.length(); i++) {

			if (chArr[i] >= 48 && chArr[i] <= 57) {

				if (result.equals("") && chArr[i] == '0') {
					continue;
				} else {
					++cnt;
					result += chArr[i];
				}
			}

			if (cnt >= 9)
				break;
		}

		System.out.println(Integer.parseInt(result));
	}
}