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

//compareTo추상 메소드인지 아니면 default메소드인지 확인!!
class Point implements Comparable<Point> {// Coordinate객체를 정렬함
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x == o.x)
			return this.y - o.y;// 음수면 오름차순으로 됨. 작은 값이 앞에 있다고 생각하면 됨.
		else
			return this.x - o.x;
	}

}
