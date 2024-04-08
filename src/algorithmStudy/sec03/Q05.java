package algorithmStudy.sec03;

/*���ӵ� �ڿ����� �� 
����
N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� N=15�̸�
7+8=15
4+5+6=15
1+2+3+4+5=15
�� ���� �� 3������ ��찡 �����Ѵ�.
�Է�
ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.
���
ù �ٿ� �� ������ ����մϴ�.
*/
import java.util.Scanner;

public class Q05 {
	public int solution(int n1) {

		int result = 0;
		int limit = (n1 % 2 == 1) ? (n1 / 2) + 1 : n1 / 2;
		for (int i = 1; i <= limit; i++) {
			int temp = 0;
			for (int k = i; k <= limit; k++) {
				temp += k;
				if (temp == n1) {
					result++;
					break;
				} else if (temp > n1) {
					break;
				}
			} // for k
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();

		Q05 m = new Q05();

		System.out.println(m.solution(n1));
	}
}
