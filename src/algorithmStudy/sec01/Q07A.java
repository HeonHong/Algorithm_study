package algorithmStudy.sec01;

//강사 다른 답
import java.util.Scanner;

public class Q07A {
	public String solution(String str) {
		String result = "YES";
		int len = str.length();
		String reversed = new StringBuilder(str).reverse().toString();
		if (!str.equalsIgnoreCase(reversed))
			result = "NO";

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q07A m = new Q07A();
		System.out.println(m.solution(str));
	}
}