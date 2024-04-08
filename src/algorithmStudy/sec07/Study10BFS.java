package algorithmStudy.sec07;

import java.util.LinkedList;
import java.util.Queue;

//이론 공부 - Tree 말단 노드까지의 가장 짧은 경로
//루트노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
//각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를, 즉 간선의 개수를 길이로 하겠습니다.
/*
lv1			   1
lv2		  2	   		3
lv3		4	5
*/
class Node {
	int data;
	Node lt, rt;// 인스턴스 변수 - 노드 주소 저장

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Study10BFS {
	Node root;

	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		Q.offer(root);
		int l = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null)
					return l+1;
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
			}
			++l;
		}
		return 0;
	}

	public static void main(String[] args) {
		Study10BFS tree = new Study10BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}

}
