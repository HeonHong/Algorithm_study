package algorithmStudy.sec04;
import java.util.*;

public class Q05A {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());// �������� ������� �׳� new TreeSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				} // for l
			} // for j
		} // for i

		int cnt = 0;
		// Tset.remove(143); 143 �� ����
		// Tset.size(); ������ ������ �˷���
		// Tset.first(); ���������̸� �ּڰ�, ���������̸� �ִ�
		// Tset.last(); ���������̸� �ִ�, ���������̸� �ּڰ�

		for (int x : Tset) {

			cnt++;
			if (cnt == k)
				return x;
			// System.out.println(x);//������������ �� ������ ����
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Q05A m = new Q05A();
		System.out.println(m.solution(arr, n, k));
	}
}