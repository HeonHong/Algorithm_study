package algorithmStudy.sec08;

import java.util.Scanner;

/*
������ ����(�޸������̼�)
����
nCr=n!/((n-r)!*r!)�� ����մϴ�.
������ �������� �� ������ �����ʰ� ���� ������ ����Ͽ� ��͸� �̿��� ���ռ��� �����ִ� ���α׷��� �ۼ��ϼ���.
nCr=(n-1)C(r-1)+(n-1)Cr

�Է�
ù° �ٿ� �ڿ��� n(3<=n<=33)�� r(0<=r<=n)�� �Էµ˴ϴ�.

���
ù° �ٿ� ���ռ��� ����մϴ�.*/
public class Q07 {
	int arr[][] = new int[35][35];

	public int DFS(int n, int r) {
		if (arr[n][r] > 0)
			return arr[n][r];
		if (n == r || r == 0)
			return 1;
		else
			return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);

	}

	public static void main(String[] args) {
		Q07 T = new Q07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));

	}

}
