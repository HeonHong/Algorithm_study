package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q12A {
	public String solution(String str, int num) {
		String result = "";

		for (int i = 0; i < num; i++) {
			String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
			int n = Integer.parseInt(tmp, 2);
			result += (char) n;
			str = str.substring(7);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = in.next();
		Q12A m = new Q12A();
		System.out.println(m.solution(str, num));
	}
}
