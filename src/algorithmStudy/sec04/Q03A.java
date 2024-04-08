package algorithmStudy.sec04;

//°­»ç ´ä
import java.util.*;

public class Q03A {

	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		int lt = 0;
		for (int rt = 0; rt < k - 1; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
		}

		for (int rt = k - 1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			result.add(map.size());

			map.put(arr[lt], map.get(arr[lt]) - 1);
			if (map.get(arr[lt]) == 0)
				map.remove(arr[lt]);
			lt++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q03A m = new Q03A();
		for (int r : m.solution(n, k, arr)) {
			System.out.print(r + " ");

		}
	}
}