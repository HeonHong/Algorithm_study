package algorithmStudy.sec07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//�̷� ���� - �۾��� ã��1(BFS:����Ʈ��Ž��)
/*������ �۾����� �Ҿ���ȴ�. ������ �۾������� ��ġ�����Ⱑ �޷� �ִ�.
������ ��ġ�� �۾����� ��ġ�� ���������� ��ǥ ������ �־����� ������ ���� ��ġ���� �۾����� ��ġ���� ������ ���� ������� �̵��Ѵ�.
�۾����� �������� �ʰ� ���ڸ��� �ִ�.
������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5�� �̵��� �� �ִ�.
�ּ� �� ���� ������ ������ �۾����� ��ġ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� ������ ��ġ S�� �۾����� ��ġ E�� �־�����. ������ ��ǥ ���� 1���� 10,000�����̴�.
���
������ �ּ�Ƚ���� ���Ѵ�. ���� 1�̻��̸� �ݵ�� �����մϴ�.
*/
public class Study08BFS {
	int answer = 0;
	int[] dis = { 1, -1, 5 };
	int[] ch;// �湮�� ���� �ٽ� ���� �ʱ� ���� üũ
	Queue<Integer> Q = new LinkedList<Integer>();

	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int l = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < dis.length; j++) {
					int nx = x + dis[j];
					if (nx == e)
						return ++l;
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			} // for j
			l++;
		} // while
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study08BFS t = new Study08BFS();
		int s = scan.nextInt();
		int e = scan.nextInt();
		System.out.println(t.BFS(s, e));

	}

}
