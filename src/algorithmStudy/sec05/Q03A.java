package algorithmStudy.sec05;

//°­»ç ´ä
import java.util.*;

public class Q03A {
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack();
		for (int pos : moves) {
			for (int i = 0; i < n; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;
					if (!stack.isEmpty() && tmp == stack.peek()) {
						stack.pop();
						answer += 2;
					} else {
						stack.push(tmp);
					}
					break;
				} // if
			} // for i
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = in.nextInt();
			} // for j
		}

		int m = in.nextInt();
		int[] moves = new int[m];
		for (int j = 0; j < m; j++) {
			moves[j] = in.nextInt();
		} // for j

		Q03A t = new Q03A();
		System.out.print(t.solution(n, board, m, moves));

	}
}