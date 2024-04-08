package algorithmStudy.sec02;

/*������ �Ҽ� 
����
N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.
ù �ڸ������� ���ӵ� 0�� �����Ѵ�.

�Է�
ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.

���
ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
*/
//�� ��
import java.util.Scanner;

public class Q06 {
	public void solution(int[] a, int num) {
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			int temp = Integer.parseInt(new StringBuilder(String.valueOf(a[i])).reverse().toString());
			for (int j = 2; j < temp; j++) {
				if (temp == 2) {
					break;
				}
				if (temp % j == 0) {
					cnt = 1;
					break;
				}
			}
			if (cnt == 0 && temp != 1)
				System.out.print(temp + " ");
			cnt = 0;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = in.nextInt();
		}
		Q06 m = new Q06();

		m.solution(a, num);

	}
}