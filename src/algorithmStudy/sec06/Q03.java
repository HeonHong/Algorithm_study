package algorithmStudy.sec06;

/*���� ���� 4��
���
���� ����� �ϳ��� �÷����鼭 ��ȸ�Ͽ� ���� ����� �� �� ���� �ڽź��� ���� �� �ڿ� ���Խ�Ű�� ���� ����̴�.
����
N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�����ϴ� ����� ���������Դϴ�.
�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�. �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
���
������������ ���ĵ� ������ ����մϴ�.*/
import java.util.Scanner;

//�� ��
public class Q03 {
	public int[] solution(int[] arr) {
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			} // for j
		} // for i
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q03 m = new Q03();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
