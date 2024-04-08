package algorithmStudy.sec07;

import java.util.Scanner;

//�̷� ���� - ����Լ��� �̿��� ������ ���
//10���� N�� �ԷµǸ� 2������ ��ȯ�ѿ� ����ϴ� ���α׷��� �ۼ��ϼ���. �� ����Լ��� �̿��ؼ� ���.
public class Study02Recursion {
	public void DFS(int n) {

		if (n == 0)
			return;
		else {
			int quotient = n / 2;
			int remainder = n % 2;
			DFS(quotient);// ���� ���������.
			System.out.print(remainder + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study02Recursion m = new Study02Recursion();
		int n = scan.nextInt();
		m.DFS(n);
	}

}
