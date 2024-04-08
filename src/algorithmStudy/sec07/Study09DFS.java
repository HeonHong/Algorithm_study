package algorithmStudy.sec07;

//�̷� ���� - Tree ���� �������� ���� ª�� ���
//��Ʈ��� 1���� ���ܳ������� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
//�� ����� ���̴� ��Ʈ��忡�� ���ܳ����� ���µ� �̵��ϴ� Ƚ����, �� ������ ������ ���̷� �ϰڽ��ϴ�.
/*
lv1			   1
lv2		  2	   		3
lv3		4	5
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
public class Study09DFS {
	Node root;

	public int DFS(int l, Node root) {
		//BFS�� �ؾ��ϴ� �� �´µ� �׳� ���÷� �غ� ����
		if (root.lt == null && root.rt == null) {
			return l;
		} else
			return Math.min(DFS(l + 1, root.lt), DFS(l + 1, root.rt));
	}

	public static void main(String[] args) {
		Study09DFS tree = new Study09DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root));
	}

}
