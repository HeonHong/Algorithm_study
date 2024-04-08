package algorithmStudy.sec02;

/*���� ���� �� 
����
A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
���� ��� N=5�̸�
�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.

���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.*/
//�� ��
import java.util.Scanner;

public class Q03 {
	public String[] solution(int[] a, int[] b, int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				result[i] = "D";
				continue;
			}

			if (a[i] > b[i]) {
				if ((a[i] - b[i]) == 1)
					result[i] = "A";
				else
					result[i] = "B";
			} else {
				if ((b[i] - a[i]) == 1)
					result[i] = "B";
				else
					result[i] = "A";
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < num; i++) {
			b[i] = in.nextInt();
		}
		Q03 m = new Q03();
		for (String r : m.solution(a, b, num)) {
			System.out.println(r);
		}

	}
}