package algorithmStudy.sec08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*동전교환
설명
다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
각 단위의 동전은 무한정 쓸 수 있다.

입력
첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.

출력
첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.*/
public class Q05 {
	static int n, amount;
	static Integer[] coins;
	static int min = Integer.MAX_VALUE;

	public void DFS(int cnt, int sum) {
		if (sum > amount)
			return;
		if (cnt > min)
			return;// 이걸 해줘야 만약에 갯수가 더 많은 케이스들을 걸러 성능을 높일 수 있다.
		if (sum == amount) {
			min = Math.min(min, cnt);
		} else {
			for (int i = 0; i < n; i++) {
				cnt++;
				DFS(cnt, sum + coins[i]);
				cnt--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		coins = new Integer[n];
		for (int i = 0; i < n; i++) {
			coins[i] = scan.nextInt();
		}
		Arrays.sort(coins, Collections.reverseOrder());
		amount = scan.nextInt();
		Q05 t = new Q05();
		t.DFS(0, 0);
		System.out.println(min);

	}

}
