package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.*;

public class Q04A {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> result = new ArrayList<>();

		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			result.add(tmp);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = in.next();
		}

		Q04A m = new Q04A();

		for (String x : m.solution(n, str)) {
			System.out.println(x);
		}

	}
}
