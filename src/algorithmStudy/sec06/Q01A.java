package algorithmStudy.sec06;

//���� ��
import java.util.Scanner;

public class Q01A {
	public int[] solution(int[] arr) {
		// ������ �ȿ� �ִ� for�� ������ �� ���� ���� ū ���� ����.
		for (int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			// �� �ڱ��� �˻��ؾ� �Ѵ�!!
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[idx] > arr[j]) {
					idx = j;
				}
			} // for j
			if (arr[idx] != arr[i]) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
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
		Q01A m = new Q01A();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
