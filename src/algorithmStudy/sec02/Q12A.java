package algorithmStudy.sec02;

//강사 답
import java.util.*;

public class Q12A {

	public int solution(int[][] arr, int n, int m) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {// 기준 학생 1번 학생부터 n번 학생까지
			for (int j = 1; j <= n; j++) {// 비교 대상 1번 학생부터 n번 학생까지
				int cnt = 0;
				for (int k = 0; k < m; k++) {// 테스트 인덱스
					int pi = 0, pj = 0;
					for (int l = 0; l < n; l++) {// k 인덱스에서 학생 인덱스 찾기
						if (arr[k][l] == i)
							pi = l;
						if (arr[k][l] == j)
							pj = l;
					} // for l
					if (pi < pj)
						cnt++;
				} // for k
				if (cnt == m)
					answer++;
			} // for j
		} // for i

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[][] arr = new int[m][n];

		Q12A T = new Q12A();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(T.solution(arr, n, m));

	}
}
