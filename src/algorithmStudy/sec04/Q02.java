package algorithmStudy.sec04;

/*�Ƴ��׷�(�ؽ�)
����
Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.
���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)��
���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.
�Է�
ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.
�ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.
���
�� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.*/

//�� ��
import java.util.*;

public class Q02 {

	public String solution(String str1, String str2) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		for (int i = 0; i < str1.length(); i++) {
			if (map1.containsKey(char1[i])) {
				int temp = map1.get(char1[i]) + 1;
				map1.put(char1[i], temp);
			} else {
				map1.put(char1[i], 1);
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			if (map2.containsKey(char2[i])) {
				int temp = map2.get(char2[i]) + 1;
				map2.put(char2[i], temp);
			} else {
				map2.put(char2[i], 1);
			}
		}
		String isBool = "YES";
		for (char key : map1.keySet()) {
			if (map1.get(key) != map2.get(key))
				isBool = "NO";
		}

		return isBool;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		Q02 m = new Q02();

		System.out.println(m.solution(str1, str2));
	}
}
