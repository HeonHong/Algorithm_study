package algorithmStudy.sec06;

import java.util.*;
/*좌표 정렬 24분
설명
N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
출력
N개의 좌표를 정렬하여 출력하세요.*/

//내 답
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
