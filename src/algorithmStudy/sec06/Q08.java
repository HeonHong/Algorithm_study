package algorithmStudy.sec06;

import java.util.*;

/*�̺а˻� (��ȣ �� �� ��!!!)
����
������ N���� ���ڰ� �Է����� �־����ϴ�. N���� ���� ������������ ������ ���� N���� �� �� �� ���� ���� M�� �־�����
�̺а˻����� M�� ���ĵ� ���¿��� �� ��°�� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���. �� �ߺ����� �������� �ʽ��ϴ�.
�Է�
ù �ٿ� �� �ٿ� �ڿ��� N(3<=N<=1,000,000)�� M�� �־����ϴ�.
�� ��° �ٿ� N���� ���� ������ ���̿� �ΰ� �־����ϴ�.
���
ù �ٿ� ���� �� M�� ���� ��ġ ��ȣ�� ����Ѵ�.*/
//�� ���̶� ���� �� ����

public class Q08 {
	public int Solution(int n, int find, int[] arr) {
		Arrays.sort(arr);
		int high = arr.length - 1;
		int low = 0;
		int idx = 0;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (arr[mid] < find) {
				low = mid + 1;
			} else if (arr[mid] > find) {
				high = mid - 1;
			} else {
				idx = mid + 1;
				break;
			}
		}

		return idx;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int find = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q08 m = new Q08();
		System.out.println(m.Solution(n, find, arr));
	}
}
