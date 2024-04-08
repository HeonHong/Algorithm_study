package algorithmStudy.sec02;

//°­»ç ´ä
import java.util.Scanner;

public class Q02A {
	public int solution(int[] arr, int n) {
		int result = 1;
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result++;
			}
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
		Q02A m = new Q02A();
		System.out.println(m.solution(arr, n));

	}
}