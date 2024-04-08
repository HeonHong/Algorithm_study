package algorithmStudy.sec03;

/*�ִ� ���� ���Ӻκм��� 
����
0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
1 1 0 0 1 1 0 1 1 0 1 1 0 1
�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����

�̸� �� ���̴� 8�Դϴ�.
�Է�
ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.
�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.
���
ù �ٿ� �ִ� ���̸� ����ϼ���.
*/

import java.util.Scanner;

public class Q06 {
	public int solution(int n1, int n2, int[] arr) {

		int result = 0;

		for (int i = 0; i < n1; i++) {
			int cnt = n2;
			int temp = 0;
			for (int k = i; k < n1; k++) {
				if (arr[k] == 0) {
					if (cnt == 0) {
						break;
					}
					temp++;
					cnt--;
				} else {
					temp++;
				}
			} // for k

			result = Math.max(temp, result);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[] arr = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr[i] = in.nextInt();
		}

		Q06 m = new Q06();

		System.out.println(m.solution(n1, n2, arr));
	}
}