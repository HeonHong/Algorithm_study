package algorithmStudy.sec05;

//°­»ç ´ä
import java.util.*;

public class Q01A {
	public String solution(String str) {
		String result = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(')
				stack.push(x);
			else {
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			} // if
		}
		if (!stack.isEmpty())
			return "NO";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q01A m = new Q01A();
		System.out.println(m.solution(str));
	}
}