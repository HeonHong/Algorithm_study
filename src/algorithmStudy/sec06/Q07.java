package algorithmStudy.sec06;

import java.util.*;
/*��ǥ ���� 24��
����
N���� ������ ��ǥ(x, y)�� �־����� ��� ��ǥ�� ������������ �����ϴ� ���α׷��� �ۼ��ϼ���.
���ı����� ���� x���� ���ؼ� �����ϰ�, x���� ���� ��� y���� ���� �����մϴ�.
�Է�
ù° �ٿ� ��ǥ�� ������ N(3<=N<=100,000)�� �־����ϴ�.
�� ��° �ٺ��� N���� ��ǥ�� x, y ������ �־����ϴ�. x, y���� ����� �Էµ˴ϴ�.
���
N���� ��ǥ�� �����Ͽ� ����ϼ���.*/

//�� ��
public class Q07 {

	public Queue<Coordinate> solution(int[] x, int[] y) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int xtmp = x[i];
					x[i] = x[j];
					x[j] = xtmp;
					int ytmp = y[i];
					y[i] = y[j];
					y[j] = ytmp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j] && y[i] > y[j]) {
					int ytmp = y[i];
					y[i] = y[j];
					y[j] = ytmp;
				}
			}

		}
		Queue<Coordinate> queue = new LinkedList<Coordinate>();
		for (int i = 0; i < x.length; i++) {
			queue.offer(new Coordinate(x[i], y[i]));
		}
		return queue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();

		}
		Q07 m = new Q07();
		Queue<Coordinate> queue = m.solution(x, y);
		for (int i = 0; i < n; i++) {
			Coordinate co = queue.poll();
			System.out.println(co.x + " " + co.y);
		}

	}
}

class Coordinate {
	int x, y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
