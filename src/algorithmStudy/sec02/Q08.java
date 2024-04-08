package algorithmStudy.sec02;

import java.util.*;

/*������ϱ�
����
N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.

�Է�
ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.


���
�Էµ� ������� ����� ����Ѵ�.*/
public class Q08 {

	public int[] solution(int[] arr, int n) {
		int[] answer = new int[n];
		Arrays.fill(answer, 1);
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[i])
					cnt++;
			}
			answer[i] = cnt;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		Q08 m = new Q08();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int x : m.solution(arr, n)) {
			System.out.print(x + " ");
		}

	}
}
