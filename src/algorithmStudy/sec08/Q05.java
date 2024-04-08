package algorithmStudy.sec08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*������ȯ
����
������ ���� ���� ������ �������� �־��� ������ �Ž������� ���� ���� ���� �������� ��ȯ���ַ��� ��� �ָ� �Ǵ°�?
�� ������ ������ ������ �� �� �ִ�.

�Է�
ù ��° �ٿ��� ������ �������� N(1<=N<=12)�� �־�����. �� ��° �ٿ��� N���� ������ ������ �־�����,
�� �����ٿ� �Ž��� �� �ݾ� M(1<=M<=500)�� �־�����.�� ������ ������ 100���� ���� �ʴ´�.

���
ù ��° �ٿ� �Ž��� �� ������ �ּҰ����� ����Ѵ�.*/
public class Q05 {
	static int n, amount;
	static Integer[] coins;
	static int min = Integer.MAX_VALUE;

	public void DFS(int cnt, int sum) {
		if (sum > amount)
			return;
		if (cnt > min)
			return;// �̰� ����� ���࿡ ������ �� ���� ���̽����� �ɷ� ������ ���� �� �ִ�.
		if (sum == amount) {
			min = Math.min(min, cnt);
		} else {
			for (int i = 0; i < n; i++) {
				cnt++;
				DFS(cnt, sum + coins[i]);
				cnt--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		coins = new Integer[n];
		for (int i = 0; i < n; i++) {
			coins[i] = scan.nextInt();
		}
		Arrays.sort(coins, Collections.reverseOrder());
		amount = scan.nextInt();
		Q05 t = new Q05();
		t.DFS(0, 0);
		System.out.println(min);

	}

}
