package algorithmStudy.sec06;

import java.util.*;

public class Q06A {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if (arr[i] != tmp[i])
				answer.add(i + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = in.nextInt();

		Q06A m = new Q06A();
		for (int x : m.solution(n, arr))
			System.out.print(x + " ");
	}
}
