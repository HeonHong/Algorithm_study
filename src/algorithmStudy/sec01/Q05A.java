package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q05A {
	public String solution(String str) {
		String result = "";
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt]))
				lt++;
			else if (!Character.isAlphabetic(s[rt]))
				rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}

		result = String.valueOf(s);
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q05A m = new Q05A();
		System.out.println(m.solution(str));
	}
}
