package algorithmStudy.sec08;

import java.util.*;

/*최대점수 구하기(DFS)
설명
이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
(해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)

입력
첫 번째 줄에 문제의 개수N(1<=N<=20)과 제한 시간 M(10<=M<=300)이 주어집니다.
두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어집니다.

출력
첫 번째 줄에 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.*/
public class Q03 {
	static int n, m, max = Integer.MIN_VALUE;

	public void DFS(int lv, int sum, int tSum, int[] score, int[] time) {
		if (tSum > m)
			return;
		if (lv == n) {
			max = Math.max(max, sum);
		} else {
			DFS(lv + 1, sum + score[lv], tSum + time[lv], score, time);
			DFS(lv + 1, sum, tSum, score, time);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		int[] score = new int[n];
		int[] time = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = scan.nextInt();
			time[i] = scan.nextInt();
		}
		Q03 t = new Q03();
		t.DFS(0, 0, 0, score, time);
		System.out.println(max);
	}

}
