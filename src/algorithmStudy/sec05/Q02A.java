package algorithmStudy.sec05;

//°­»ç´ä
import java.util.*;

public class Q02A {
	public String solution(String str) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == ')') {
				while (stack.pop() != '(')
					;
			} else {
				stack.push(x);
			} // if
		} // for

		for (int i = 0; i < stack.size(); i++) {
			result += stack.get(i);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q02A m = new Q02A();
		System.out.print(m.solution(str));
	}
}