package algorithmStudy.sec01;

//강사답
import java.util.Scanner;

public class Q02A {
	public String solution(String str) {
		String result = "";
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x))
				result += Character.toUpperCase(x);
			else
				result += Character.toLowerCase(x);

			// 아스키코드 이용할 경우
			// 대문자 65~90
			// 소문자 97~122
			// 숫자 48~57
			if (x >= 65 && x <= 90)
				result += (char) (x + 32);
			else
				result += (char) (x - 32);

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		Q02A m = new Q02A();

		System.out.println(m.solution(input1));
	}
}