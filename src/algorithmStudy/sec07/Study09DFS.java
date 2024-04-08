package algorithmStudy.sec07;

//이론 공부 - Tree 말단 노드까지의 가장 짧은 경로
//루트노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
//각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를, 즉 간선의 개수를 길이로 하겠습니다.
/*
lv1			   1
lv2		  2	   		3
lv3		4	5
*/
//class Node {
//	int data;
//	Node lt, rt;// 인스턴스 변수 - 노드 주소 저장
//
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}
public class Study09DFS {
	Node root;

	public int DFS(int l, Node root) {
		//BFS로 해야하는 게 맞는데 그냥 예시로 해본 것임
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
