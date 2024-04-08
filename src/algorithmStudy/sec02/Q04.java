package algorithmStudy.sec02;

/*�Ǻ���ġ ����
����
1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.

�Է�
ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.

���
ù �ٿ� �Ǻ���ġ ������ ����մϴ�.*/

//�� ��
import java.util.Scanner;

public class Q04 {
	public int[] solution(int n) {
		int[] result = new int[n];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < n; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		Q04 m = new Q04();
		for (int r : m.solution(num)) {
			System.out.print(r + " ");
		}
	}
}
