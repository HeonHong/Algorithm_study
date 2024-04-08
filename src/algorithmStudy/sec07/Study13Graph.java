package algorithmStudy.sec07;

import java.util.ArrayList;
import java.util.Scanner;

//�̷� ���� - ���Ž��(��������Ʈ)(��Ʈ��ŷ)
//����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
//n�� Ŀ���� ������ķ� ã�� �� �ſ� �����ɸ��� �޸𸮵� ���� �����Ѵ�.
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
