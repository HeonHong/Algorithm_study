package algorithmStudy.sec03;

//�� ���ο� ��
import java.util.*;

public class Q05_2 {

	public int solution(int n) {
		int result = 0, sum = 0;
		int lt = 0, rt = 0;
		while (rt <= ((n / 2) + 2)) {
			// ��ȣ ���� �� �߿���
			// n�� 19�� �� 10���� ���ϰ� 11�� �Ѿ ���� Ȧ�� �ȴ�.
			// ���� lt�� �����ϴµ� ((n/2)+1)�� ��� 11�̴ϱ� ���� �ʰ� ������ ��.
			// ����ó�� for�� �ȿ� lt ���� �����ϴ� while���� ����� ���� ����.
			if (sum <= n) {
				sum += rt++;

			} else {
				sum -= lt++;

			}
			if (sum == n)
				result++;

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q05_2 T = new Q05_2();
		System.out.print(T.solution(n));
	}
}