package algorithmStudy.sec05;
/*올바른 괄호 
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
출력
첫 번째 줄에 YES, NO를 출력한다.*/

//내 답
import java.util.*;

public class Q01 {
	public String solution(String str) {
		String result = "YES";
		Stack st = new Stack();

		if (str.charAt(str.length() - 1) == '(' || str.charAt(0) == ')' || str.length() % 2 == 1)
			return "NO";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				st.push('(');
			else if (st.empty() && str.charAt(i) == ')')
				return "NO";
			else if (str.charAt(i) == ')')
				st.pop();
		}
		if (!st.empty())
			return "NO";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q01 m = new Q01();
		System.out.println(m.solution(str));
	}
}
