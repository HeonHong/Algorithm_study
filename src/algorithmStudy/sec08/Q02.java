package algorithmStudy.sec08;

import java.util.*;

/*바둑이 승차(DFS)
설명
철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.

입력
첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
둘째 줄부터 N마리 바둑이의 무게가 주어진다.

출력
첫 번째 줄에 가장 무거운 무게를 출력한다. */
public class Q02 {
	static int c, n, max = Integer.MIN_VALUE;

	public void DFS(int lv, int wSum, int[] arr) {
		if (wSum > c)
			return;
		if (lv == n)
			max = Math.max(max, wSum);
		else {
//			max = Math.max(max, wSum); 이 위치가 아니라 마지막lv까지 가서 확인해야 된다.
			DFS(lv + 1, wSum + arr[lv], arr);
			DFS(lv + 1, wSum, arr);
		}
	}

	public static void main(String[] args) {
		Q02 t = new Q02();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		t.DFS(0, 0, arr);
		System.out.println(max);
	}

}
