package algorithmStudy.sec02;

/*ū �� ����ϱ�
����
N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
(ù ��° ���� ������ ����Ѵ�)

�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.

���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.

�� ��
�˾ƾ� �� ��.
���� �迭�� ���� ������� null�� �ƴ϶� 0�� �ȴ�.*/
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] num, int n) {
		int[] result = new int[n];
		result[0] = num[0];
		for (int i = 1; i < n; i++) {
			if (num[i - 1] < num[i]) {
				result[i] = num[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = in.nextInt();
		}
		Q01 m = new Q01();
		for (int r : m.solution(num, n)) {
			if (r != 0)
				System.out.print(r + " ");
		}

	}
}