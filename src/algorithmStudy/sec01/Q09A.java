package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q09A {
	public int solution(String str) {
		int result = 0;

		for (char x : str.toCharArray())
			if (x >= 48 && x <= 57)
				result = result * 10 + (x - 48);

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q09A m = new Q09A();
		System.out.println(m.solution(str));
	}
}
