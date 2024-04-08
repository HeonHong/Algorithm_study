package algorithmStudy.sec01;


//°­»ç ´ä
import java.util.Scanner;

public class Q03A_2 {
	public String solution(String str) {
		String result = "";
		int m = Integer.MIN_VALUE, pos;

		while ((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				result = tmp;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > m)
			result = str;

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Q03A_2 m = new Q03A_2();
		System.out.println(m.solution(str));
	}
}