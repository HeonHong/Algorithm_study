package algorithmStudy.sec08;

import java.util.*;

/*�ִ����� ���ϱ�(DFS)
����
�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.
�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�µ� �ɸ��� �ð��� �־����� �˴ϴ�.
���ѽð� M�ȿ� N���� ���� �� �ִ������� ���� �� �ֵ��� �ؾ� �մϴ�.
(�ش繮���� �ش�ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �Ѱ��� Ǯ �� �ֽ��ϴ�.)

�Է�
ù ��° �ٿ� ������ ����N(1<=N<=20)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.
�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�µ� �ɸ��� �ð��� �־����ϴ�.

���
ù ��° �ٿ� ���� �ð��ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.*/
public class Q03 {
	static int n, m, max = Integer.MIN_VALUE;

	public void DFS(int lv, int sum, int tSum, int[] score, int[] time) {
		if (tSum > m)
			return;
		if (lv == n) {
			max = Math.max(max, sum);
		} else {
			DFS(lv + 1, sum + score[lv], tSum + time[lv], score, time);
			DFS(lv + 1, sum, tSum, score, time);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		int[] score = new int[n];
		int[] time = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = scan.nextInt();
			time[i] = scan.nextInt();
		}
		Q03 t = new Q03();
		t.DFS(0, 0, 0, score, time);
		System.out.println(max);
	}

}
