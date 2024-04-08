package algorithmStudy.sec05;

//강사 답
import java.util.*;

public class Q04A {
	public int solution(String str) {
		Stack<Integer> stack = new Stack();
		for (char x : str.toCharArray()) {// forEach는 배열 혹은 collection framework만 가능하다
			if (Character.isDigit(x)) {
				stack.push(x - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+')
					stack.push(lt + rt);
				if (x == '-')
					stack.push(lt - rt);
				if (x == '*')
					stack.push(lt * rt);
				if (x == '/')
					stack.push(lt / rt);
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q04A t = new Q04A();
		System.out.print(t.solution(str));

	}
}