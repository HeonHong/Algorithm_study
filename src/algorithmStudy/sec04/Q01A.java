package algorithmStudy.sec04;

//���� ��
import java.util.*;

public class Q01A {
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		Q01A m = new Q01A();
		System.out.println(m.solution(n, str));
	}
}