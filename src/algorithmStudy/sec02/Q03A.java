package algorithmStudy.sec02;

//°­»ç´ä
import java.util.Scanner;

public class Q03A {
	public String solution(int[] a, int[] b, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				result += "D";
			else if (a[i] == 1 && b[i] == 3)
				result += "A";
			else if (a[i] == 2 && b[i] == 1)
				result += "A";
			else if (a[i] == 3 && b[i] == 2)
				result += "A";
			else
				result += "B";

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		Q03A m = new Q03A();
		for (char x : m.solution(a, b, n).toCharArray()) {
			System.out.println(x);
		}

	}
}
