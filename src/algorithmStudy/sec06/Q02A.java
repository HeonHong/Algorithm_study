package algorithmStudy.sec06;

//���� ��
import java.util.Scanner;

public class Q02A {
	public int[] solution(int[] arr) {
		int cnt = 0;
//������ �� �� ���� �ڵ����� ���ϱ� ������ n-1ȸ���� ��ȸ�ϸ� �ȴ�.
		for (int i = 0; i < arr.length - 1; i++) {
//�� ȸ������ ���� ū ��, �������� ū ���� �ִ� ������� �̹� ���� ������ �����Ǳ� ������ �� ȸ������ j�� for���� �� �迭 ��ü�� �ƴ� �� ���� �ٿ������� �ȴ�.
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			} // for j
		} // for i

		cnt++;
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q02A m = new Q02A();
		for (int x : m.solution(arr))
			System.out.print(x + " ");
	}
}
