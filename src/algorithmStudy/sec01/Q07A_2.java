package algorithmStudy.sec01;

//°­»ç´ä
import java.util.Scanner;

public class Q07A_2 {
	public String solution(String str) {
		String result = "YES";
		str = str.toUpperCase();
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				result = "NO";
				break;
				// return "NO";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q07A_2 m = new Q07A_2();
		System.out.println(m.solution(str));
	}
}