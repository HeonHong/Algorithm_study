package algorithmStudy.sec06;

/*���� ����
���
�迭�� ��ü ��ȸ�� �ݺ������� �Ͽ� ���� ���� ���� �� �տ� �־��ְ� �ش� �迭�� ���� ��󿡼� ���ܽ��� �������� �ϳ��� �ٿ������� ���� ����̴�. 
����
N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�����ϴ� ����� ���������Դϴ�.
�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�. �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
*/

//�� ��
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];// ���� �� �����ϸ� �̰� ���� ����� �ʿ� ����. idx�� ����ϸ��.
			int idx = 0;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			} // for j

			if (arr[i] > min) {
				arr[idx] = arr[i];
				arr[i] = min;
			}
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
		Q01 m = new Q01();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
