package algorithmStudy.sec02;

/*�Ҽ�(�����佺�׳׽� ü) 24��(���� Time exceed)
����
�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.

�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.

���
ù �ٿ� �Ҽ��� ������ ����մϴ�.*/

import java.util.Scanner;

public class Q05 {
	public int solution(int n) {
		int result = 1;

		for (int i = 3; i <= n; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = 1;
					break;
				}
			}
			if (temp == 0)
				result++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Q05 m = new Q05();

		System.out.print(m.solution(num));

	}
}