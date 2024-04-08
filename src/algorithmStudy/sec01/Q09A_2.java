package algorithmStudy.sec01;

//강사 다른 답
import java.util.Scanner;

public class Q09A_2 {
	public int solution(String str) {
		String result = "";

		for (char x : str.toCharArray()) {
			if (Character.isDigit(x))
				result += x;
		}

		return Integer.parseInt(result);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q09A_2 m = new Q09A_2();
		System.out.println(m.solution(str));
	}
}