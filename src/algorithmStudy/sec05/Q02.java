package algorithmStudy.sec05;

/*괄호문자제거
설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
*/

//내 답
import java.util.*;

public class Q02 {
	public String solution(String str) {
		String result = "";
		Stack st = new Stack();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				while ((char) st.peek() != '(')
					st.pop();
				st.pop();
			} else {
				st.push(str.charAt(i));
			}
		}
		while (!st.empty()) {
			result += st.pop();
		}

		return new StringBuilder(result).reverse().toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Q02 m = new Q02();

		System.out.print(m.solution(str));

	}
}