package algorithmStudy.sec02;

//강사답
import java.util.*;

public class Q10A {
	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, 1, 0, -1 };

	public int solution(int[][] arr, int n) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < dx.length; k++) {
					int nx = i + dx[k];// 행좌표
					int ny = j + dy[k];
					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					} // if
				} // for k
				if (flag)
					answer++;
			} // for j
		} // for i

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];

		Q10A m = new Q10A();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(m.solution(arr, n));

	}
}