package algorithmStudy.sec06;

import java.util.*;

public class Q07A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			arr.add(new Point(x, y));
		}

		Collections.sort(arr);
		for (Point p : arr) {
			System.out.println(p.x + " " + p.y);
		}
	}
}

//compareTo�߻� �޼ҵ����� �ƴϸ� default�޼ҵ����� Ȯ��!!
class Point implements Comparable<Point> {// Coordinate��ü�� ������
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x == o.x)
			return this.y - o.y;// ������ ������������ ��. ���� ���� �տ� �ִٰ� �����ϸ� ��.
		else
			return this.x - o.x;
	}

}
