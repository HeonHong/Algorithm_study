package algorithmStudy.sec01;

/*대소문자 변환
설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/
//내 답
import java.util.Scanner;

public class Q02 {
	private String changeCase(String input1) {
		String result = "";
		String inputC = input1.toLowerCase();
		for (int i = 0; i < input1.length(); i++) {
			result += (inputC.charAt(i) == input1.charAt(i)) ? inputC.toUpperCase().charAt(i) : inputC.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		Q02 m = new Q02();
		System.out.println(m.changeCase(input1));
	}
}