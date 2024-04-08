package algorithmStudy.sec01;

//°­»ç ´ä
import java.util.Scanner;

public class Q01A {

	public int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);

		for (char x : str.toCharArray()) {
			if (x == c)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		char c = in.next().charAt(0);

		Q01A m = new Q01A();
		System.out.println(m.solution(input1, c));
	}
}