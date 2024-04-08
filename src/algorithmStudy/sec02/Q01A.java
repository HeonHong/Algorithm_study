package algorithmStudy.sec02;

//°­»ç ´ä
import java.util.*;

public class Q01A {
	public ArrayList<Integer> solution(int[] arr, int n) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				result.add(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q01A m = new Q01A();
		for (int r : m.solution(arr, n)) {
			if (r != 0)
				System.out.print(r + " ");
		}

	}
}
