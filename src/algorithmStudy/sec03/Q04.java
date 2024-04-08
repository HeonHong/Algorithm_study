package algorithmStudy.sec03;

import java.util.Scanner;

/*���� �κм���
����
N���� ���� �̷���� ������ �־����ϴ�.
�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
���� N=8, M=6�̰� ������ ������ ���ٸ�
1 2 1 3 1 1 1 2
���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.
�Է�
ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.
������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.
���
ù° �ٿ� ����� ���� ����Ѵ�.*/

//�� ��
public class Q04 {
	public int solution(int[] arr, int n1, int n2) {

		int result = 0;
		boolean isTrue = false;

		for (int i = 0; i < n1; i++) {
			int tmp = 0;

			for (int k = i; k < n1; k++) {
				tmp += arr[k];
				if (tmp == n2) {
					isTrue = true;
					break;
				} else if (tmp > n2) {
					break;
				}
			} // for k

			if (isTrue) {
				result++;
			}

			isTrue = false;
		} // for i

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

		Q04 m = new Q04();

		System.out.println(m.solution(arr, n1, n2));
	}
}