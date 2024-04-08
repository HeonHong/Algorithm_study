package algorithmStudy.sec01;

import java.util.*;

//다른 풀이
public class Q04A_2 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> result = new ArrayList<>();

		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}

			result.add(String.valueOf(s));
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

		Q04A_2 m = new Q04A_2();

		for (String x : m.solution(n, str)) {
			System.out.println(x);
		}

	}
}