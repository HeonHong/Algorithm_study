package algorithmStudy.sec07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//이론 공부 - 그래프 최단거리(BFS)
//각 정점으로 가는 최소 이동 간선수를 출력
public class Study14GraphBFS {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;// 체크용
	static int[] dis;// 거리 측정용

	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while (!queue.isEmpty()) {
			int cv = queue.poll();
			for (int nv : graph.get(cv)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Study14GraphBFS t = new Study14GraphBFS();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];
		dis = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		t.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}

//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5