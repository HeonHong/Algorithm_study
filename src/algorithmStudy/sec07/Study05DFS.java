package algorithmStudy.sec07;

import java.util.*;

/*	  1
	2	3
4	5	6	7*/

//�̷� ���� - ����Ʈ�� ��ȸ
//Depth First Search(���� �켱 Ž��)
//������ȸ - �θ� > ���� �ڽ� > ������ �ڽ� 1245367
//������ȸ = ���� �ڽ�(������ ���� �ڽĺ���) > �θ� > ������ �ڽ� 4251637
//������ȸ = ���� �ڽ�(������ �ڽĵ�) > ������ �ڽ�(������ �ڽĵ�) > �θ� 4526731
//class Node {
//	int data;
//	Node lt, rt;// �ν��Ͻ� ���� - ��� �ּ� ����
//
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}

public class Study05DFS {
	Node root;

	public void DFS(Node root) {
		if (root == null)
			return;
		else {
			// ������ȸ
//			System.out.print(root.data+" ");
//			DFS(root.lt);
//			DFS(root.rt);
//			
			// ������ȸ
//			DFS(root.lt);
//			System.out.print(root.data+" ");
//			DFS(root.rt);

			// ��������
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data + " ");
		}

	}

	public static void main(String[] args) {
		Study05DFS tree = new Study05DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);

	}

}
