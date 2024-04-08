package algorithmStudy.sec06;
/*���� ���� 6��
��� 
�������� �����̶�� ������ ��, ������ �� ���� ���ؼ� ū ���� �ڷ� �����鼭 ���� ����� �ϳ��� �ٿ������� ���� ����̴�.
����
N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�����ϴ� ����� ���������Դϴ�.
�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�. �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
���
������������ ���ĵ� ������ ����մϴ�.*/

//�� ��
import java.util.Scanner;

public class Q02 {
	public int[] solution(int[] arr) {
		int cnt = 0;
		while (cnt < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} // for i

			cnt++;
		} // while
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q02 m = new Q02();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}