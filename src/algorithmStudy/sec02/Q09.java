package algorithmStudy.sec02;

//격자판 최대합 (수정)
//설명
//5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//
//입력
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//
//출력
//최대합을 출력합니다.

import java.util.Scanner;

public class Q09 {
	public int solution(int[][] score, int num) {
		int result = Integer.MIN_VALUE;

		int cross = 0;
		int rCross = 0;
		// 대각선 값
		for (int i = 0; i < num; i++) {
			cross += score[i][i];
			rCross += score[i][num - i - 1];
		}
		result = Math.max(result, cross);
		result = Math.max(result, rCross);
		for (int i = 0; i < num; i++) {
			int row = 0;// 행의 합
			int col = 0;// 열의 합
			for (int j = 0; j < num; j++) {
				row += score[i][j];
				col += score[j][i];
			}
			result = Math.max(result, row);
			result = Math.max(result, col);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] score = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {// 카피할 때 조심할 것
				score[i][j] = in.nextInt();
			}
		}
		Q09 m = new Q09();

		System.out.print(m.solution(score, num));

	}
}