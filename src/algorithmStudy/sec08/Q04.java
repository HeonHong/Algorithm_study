package algorithmStudy.sec08;

import java.util.Scanner;

/*중복순열 구하기
1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열
하는 방법을 모두 출력합니다.

▣ 입력설명
첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
▣ 출력설명
첫 번째 줄에 결과를 출력합니다.
출력순서는 사전순으로 오름차순으로 출력합니다. */
public class Q04 {
	static int n, m;
	static int[] ch;

	public void DFS(int lv) {
		if (lv == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				ch[lv] = i;
				DFS(lv + 1);
			}

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch = new int[m];
		Q04 t = new Q04();
		t.DFS(0);

	}

}
