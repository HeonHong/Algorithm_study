package algorithmStudy.sec02;

/*봉우리
설명
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
출력
봉우리의 개수를 출력하세요.*/

//내 답
import java.util.Scanner;

public class Q10 {
	public int solution(int[][] score, int num) {
		int result = 0;
		for (int i = 1; i < score.length - 1; i++) {
			for (int j = 1; j < score.length - 1; j++) {
				boolean isTrue = score[i][j] > score[i - 1][j] && score[i][j] > score[i][j + 1]
						&& score[i][j] > score[i][j - 1] && score[i][j] > score[i + 1][j];// 이렇게 할 수도 있겠지만 만약에 대각선 방향도
																							// 고려해야할 경우 8번의 조건문이 필요하게
																							// 된다.
				if (isTrue)
					result++;

			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] score = new int[num + 2][num + 2];
		for (int i = 1; i < score.length - 1; i++) {
			for (int j = 1; j < score.length - 1; j++) {
				score[i][j] = in.nextInt();
			}
		}
		Q10 m = new Q10();

		System.out.print(m.solution(score, num));

	}
}