package algorithmStudy.sec01;

//³» ´ä
import java.util.Scanner;

public class Q12_2 {
	public String solution(String str, int n) {
		String result = "";

		str = str.replace("#", "1");
		str = str.replace("*", "0");

		for (int i = 0; i < n; i++) {
			int stIndex = i * 7;
			String s = str.substring(stIndex, stIndex + 7);
			int temp = Integer.parseInt(s, 2);
			result += (char) temp;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = in.next();

		Q12_2 m = new Q12_2();
		System.out.println(m.solution(str, num));
	}
}
