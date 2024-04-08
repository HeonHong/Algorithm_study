package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q06A {
	public String solution(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i)
				result += str.charAt(i);

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q06A m = new Q06A();
		System.out.println(m.solution(str));
	}
}
