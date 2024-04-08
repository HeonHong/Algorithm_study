package algorithmStudy.sec03;

/*�ִ� ���� (Sliding Window)
����
������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�
12 15 11 20 2510 20 19 13 15
���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
�������� ������ �����ּ���.
�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
���
ù �ٿ� �ִ� ������� ����մϴ�.*/
//�� ��
import java.util.Scanner;

public class Q03 {
	public int solution(int[] arr, int n1, int n2) {

		int result = Integer.MIN_VALUE;
		int tmp = 0;

		for (int i = 0; i < n1 - n2; i++) {
			if (i == 0) {
				for (int k = i; k < i + n2; k++) {
					tmp += arr[k];
				} // for k
			} // if
			else {
				tmp = tmp - arr[i - 1] + arr[i + n2 - 1];
			}
			result = Math.max(tmp, result);
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

		Q03 m = new Q03();

		System.out.println(m.solution(arr, n1, n2));
	}
}