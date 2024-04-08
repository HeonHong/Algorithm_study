package algorithmStudy.sec07;

import java.util.*;

/*	  1
	2	3
4	5	6	7*/

//이론 공부 - 이진트리 순회
//Depth First Search(깊이 우선 탐색)
//전위순회 - 부모 > 왼쪽 자식 > 오른쪽 자식 1245367
//중위순회 = 왼쪽 자식(최하위 왼쪽 자식부터) > 부모 > 오른쪽 자식 4251637
//후위순회 = 왼쪽 자식(최하위 자식들) > 오른쪽 자식(최하위 자식들) > 부모 4526731
//class Node {
//	int data;
//	Node lt, rt;// 인스턴스 변수 - 노드 주소 저장
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
			// 전위순회
//			System.out.print(root.data+" ");
//			DFS(root.lt);
//			DFS(root.rt);
//			
			// 중위순회
//			DFS(root.lt);
//			System.out.print(root.data+" ");
//			DFS(root.rt);

			// 후위순위
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
