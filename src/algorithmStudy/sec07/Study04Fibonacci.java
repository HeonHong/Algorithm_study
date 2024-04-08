package algorithmStudy.sec07;

import java.util.Scanner;

//�̷� ���� - �Ǻ���ġ ����
//���������� �̿��ϱ� ������ for������ ������ ���� ���� ����.
public class Study04Fibonacci {
	static int[] fibo;

	public int DFS(int n) {
//		if (n == 1)
//			return 1;
//		else if (n == 2)
//			return 1;
//		else
//			return DFS(n - 2) + DFS(n - 1);

		// �޸������̼�
		if (fibo[n] > 0)
			return fibo[n];

		// ��� ���� ������ ���
		if (n == 1)
			return fibo[n] = 1;
		else if (n == 2)
			return fibo[n] = 1;
		else
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
	}

//	�� ���� ���
//	public int sum(int n) {
//		if (n == 0)
//			return 0;
//		else
//			return sum(n - 1) + DFS(n);
//	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study04Fibonacci m = new Study04Fibonacci();
		int n = scan.nextInt();

		// ��� ���� ������ ���
		fibo = new int[n + 1];
		m.DFS(n);
		for (int i = 1; i <= n; i++)
			System.out.println(fibo[i] + " ");
	}

}
