package algorithmStudy.sec02;

//°­»ç ´ä
import java.util.Scanner;

public class Q04A {
	public int[] solution(int n) {
		int[] result = new int[n];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < n; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q04A m = new Q04A();
		for (int x : m.solution(n)) {
			System.out.print(x + " ");
		}

	}
}
