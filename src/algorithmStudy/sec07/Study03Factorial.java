package algorithmStudy.sec07;

import java.util.Scanner;

//�̷� ���� - ���丮��
//�ڿ��� N�� �ԷµǸ� N!�� ���ϴ� ���α׷��� �ۼ��ϼ���.
public class Study03Factorial {
	public int DFS(int n) {
		if (n == 1)
			return 1;
		else
			return n * DFS(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study03Factorial m = new Study03Factorial();
		int n = scan.nextInt();
		System.out.println(m.DFS(n));
	}

}
