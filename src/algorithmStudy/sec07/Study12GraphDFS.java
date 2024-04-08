package algorithmStudy.sec07;

import java.util.Scanner;

//�̷� ���� - ���Ž��(�������)(��Ʈ��ŷ)
//����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class Study12GraphDFS {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;

	public void DFS(int v) {
		if (v == n)
			answer++;
		else {
			for (int i = 1; i <= n; i++) {
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;// ��Ʈ��ŷ�ϱ�����
				}
			}
		}
	}

	public static void main(String[] args) {
		Study12GraphDFS t = new Study12GraphDFS();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new int[n + 1][m + 1];
		ch = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
	}

}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5