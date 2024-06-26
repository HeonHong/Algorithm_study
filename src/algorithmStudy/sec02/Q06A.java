package algorithmStudy.sec02;

//���� ��
import java.util.*;

public class Q06A {
	public boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public ArrayList<Integer> solution(int[] arr, int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if (isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		Q06A m = new Q06A();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int x : m.solution(arr, n)) {
			System.out.print(x + " ");

		}
	}
}
