package algorithmStudy.sec04;

/*�б� ȸ��(�ؽ�)
����
�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.
�Է�
ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.
���
�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.*/
//�� ��
import java.util.*;

public class Q01 {
	public char solution(int n, String str) {
		char[] arr = str.toCharArray();
		char result = 'A';
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				int temp = map.get(arr[i]) + 1;
				map.put(arr[i], temp);
			} else {
				map.put(arr[i], 1);
			}
		} // for i
		int num = 65;
		int max = 0;

		for (int i = 0; i < 5; i++) {
			char r = (char) (i + num);
			if (map.get(r) > max) {
				max = map.get(r);
				result = r;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		Q01 m = new Q01();
		System.out.println(m.solution(n, str));
	}
}