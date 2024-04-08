package algorithmStudy.sec08;

import java.util.*;

/*�ٵ��� ����(DFS)
����
ö���� ���� �ٵ��̵��� ������ ���忡 ������ �Ѵ�. �׷��� ���� Ʈ���� Cų�α׷� �Ѱ� �¿���� ����.
ö���� C�� ���� �����鼭 ���� �ٵ��̵��� ���� ���̰� �¿�� �ʹ�.
N������ �ٵ��̿� �� �ٵ����� ���� W�� �־�����, ö���� Ʈ���� �¿� �� �ִ� ���� ���ſ� ���Ը� ���ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� �ڿ��� C(1<=C<=100,000,000)�� N(1<=N<=30)�� �־����ϴ�.
��° �ٺ��� N���� �ٵ����� ���԰� �־�����.

���
ù ��° �ٿ� ���� ���ſ� ���Ը� ����Ѵ�. */
public class Q02 {
	static int c, n, max = Integer.MIN_VALUE;

	public void DFS(int lv, int wSum, int[] arr) {
		if (wSum > c)
			return;
		if (lv == n)
			max = Math.max(max, wSum);
		else {
//			max = Math.max(max, wSum); �� ��ġ�� �ƴ϶� ������lv���� ���� Ȯ���ؾ� �ȴ�.
			DFS(lv + 1, wSum + arr[lv], arr);
			DFS(lv + 1, wSum, arr);
		}
	}

	public static void main(String[] args) {
		Q02 t = new Q02();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		t.DFS(0, 0, arr);
		System.out.println(max);
	}

}
