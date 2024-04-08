package algorithmStudy.sec07;

import java.util.ArrayList;
import java.util.Scanner;

//이론 공부 - 경로탐색(인접리스트)(백트래킹)
//방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
//n이 커지면 인접행렬로 찾을 때 매우 오래걸리고 메모리도 많이 차지한다.
public class Study13Graph {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public void DFS(int v) {
		if (v == n)
			answer++;
		else {
			for (int nv : graph.get(v)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {

		Study13Graph t = new Study13Graph();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
	}

}
