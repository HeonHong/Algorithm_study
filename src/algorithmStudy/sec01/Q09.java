package algorithmStudy.sec01;

/*숫자만 추출
설명
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

입력
첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.

출력
첫 줄에 자연수를 출력합니다.
*/
//내 답
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		// uppercase로 변경
		// 65~92거르고
		// parseInt로 숫자로 변경해서 100,000,000 이하인지 확인
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		char[] chArr = input1.toCharArray();
		int cnt = 0;
		String result = "";
		for (int i = 0; i < input1.length(); i++) {

			if (chArr[i] >= 48 && chArr[i] <= 57) {

				if (result.equals("") && chArr[i] == '0') {
					continue;
				} else {
					++cnt;
					result += chArr[i];
				}
			}

			if (cnt >= 9)
				break;
		}

		System.out.println(Integer.parseInt(result));
	}
}