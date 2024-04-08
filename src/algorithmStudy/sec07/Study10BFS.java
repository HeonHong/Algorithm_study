package algorithmStudy.sec07;

import java.util.LinkedList;
import java.util.Queue;

//�̷� ���� - Tree ���� �������� ���� ª�� ���
//��Ʈ��� 1���� ���ܳ������� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
//�� ����� ���̴� ��Ʈ��忡�� ���ܳ����� ���µ� �̵��ϴ� Ƚ����, �� ������ ������ ���̷� �ϰڽ��ϴ�.
/*
lv1			   1
lv2		  2	   		3
lv3		4	5
*/
class Node {
	int data;
	Node lt, rt;// �ν��Ͻ� ���� - ��� �ּ� ����

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
