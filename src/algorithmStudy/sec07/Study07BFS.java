package algorithmStudy.sec07;

import java.util.LinkedList;
import java.util.Queue;

//�̷� ���� - ����Ʈ����ȸ(���̿켱Ž�� : ����Ž��)
//BFS(Breadth-First Search)
//���� ���� Ž���ϴ� ���.�ִܰŸ� Ž���� ����.
/*	  
LV0  		  1
LV1			2	3
LV2		4	5	6	7
*/
//class Node {
//	int data;
//	Node lt, rt;// �ν��Ͻ� ���� - ��� �ּ� ����
//
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}
public class Study07BFS {
	Node root;

	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
				
			}
			L++;
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Study07BFS tree = new Study07BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}

}
