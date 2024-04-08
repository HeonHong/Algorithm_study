package algorithmStudy.sec05;

/*후위식 연산(postfix) (생각 정리 꼭 하고 풀 것!!!)
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
출력
연산한 결과를 출력합니다.*/

import java.util.*;

public class Q04 {
	public int solution(String str) {
		Stack<Integer> st = new Stack();
		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) {
				st.push((int) x - 48);
			} else {
				if (x == '+')
					st.push(st.pop() + st.pop());
				if (x == '-')
					st.push(-st.pop() + st.pop());
				if (x == '*')
					st.push(st.pop() * st.pop());
				if (x == '/')
					st.push(1 / st.pop() * st.pop());
			}
		}
		return st.pop();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();

		Q04 t = new Q04();
		System.out.print(t.solution(str));

	}
}