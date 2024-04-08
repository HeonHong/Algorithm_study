package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q11A {
	public String solution(String str) {
		String result = "";

		str = str + " ";
		int cnt = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				result += str.charAt(i);
				if (cnt > 1)
					result += String.valueOf(cnt);
				cnt = 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q11A m = new Q11A();
		System.out.println(m.solution(str));
	}
}
