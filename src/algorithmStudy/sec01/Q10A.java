package algorithmStudy.sec01;

//���� ��
import java.util.Scanner;

public class Q10A {
	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == c)
				p = 0;
			else {
				p++;
				answer[i] = Math.min(p, answer[i]);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char c = in.next().charAt(0);
		Q10A m = new Q10A();
		for (int x : m.solution(str, c)) {
			System.out.print(x + " ");

		}
	}
}
