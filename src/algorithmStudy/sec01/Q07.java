package algorithmStudy.sec01;

/*ȸ�� ���ڿ�
����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.

�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.

���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
*/

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String upInput = input.toUpperCase();
		String reversed = "";

		for (int i = 0; i < input.length(); i++) {
			reversed += input.charAt(input.length() - i - 1);
		}
		reversed = reversed.toUpperCase();
		String result = upInput.equals(reversed) ? "YES" : "NO";

		System.out.println(result);
	}
}