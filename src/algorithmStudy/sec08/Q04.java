package algorithmStudy.sec08;

import java.util.Scanner;

/*�ߺ����� ���ϱ�
1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. �� �� �ߺ��� ����Ͽ� M���� �̾� �Ϸķ� ����
�ϴ� ����� ��� ����մϴ�.

�� �Է¼���
ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N) �� �־����ϴ�.
�� ��¼���
ù ��° �ٿ� ����� ����մϴ�.
��¼����� ���������� ������������ ����մϴ�. */
public class Q04 {
	static int n, m;
	static int[] ch;

	public void DFS(int lv) {
		if (lv == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				ch[lv] = i;
				DFS(lv + 1);
			}

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch = new int[m];
		Q04 t = new Q04();
		t.DFS(0);

	}

}
