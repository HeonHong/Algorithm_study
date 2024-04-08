package algorithmStudy.sec07;

import java.util.*;

//이론 공부 - 부분집합 구하기(DFS)
public class Study06DFS {
	static int n;
	static int[] ch;

	public void DFS(int L) {
		if (L == n + 1) {
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1)
					System.out.print(i + " ");
			}
			System.out.println();
		} else {
			ch[L] = 1;
			DFS(L + 1);// o
			ch[L] = 0;
			DFS(L + 1);// x
		}
	}

	public static void main(String[] args) {
		Study06DFS t = new Study06DFS();
		n = 3;
		ch = new int[n + 1];
		t.DFS(1);
	}

}
