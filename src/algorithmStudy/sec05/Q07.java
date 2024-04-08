package algorithmStudy.sec05;

/*�������� ����
����
������ 1�� ������ ������ȹ�� ¥�� �մϴ�.
�����߿��� �ʼ������� �ֽ��ϴ�. �� �ʼ������� �ݵ�� �̼��ؾ� �ϸ�, �� ������ ������ �ֽ��ϴ�.
���� �� ������ A, B, C, D, E, F, G�� �ְ�, ���⼭ �ʼ������� CBA�� �־����� �ʼ������� C, B, A�����̸� �� ������� �� ������ȹ�� ¥�� �մϴ�.
���⼭ ������ B������ C������ �̼��� �Ŀ� ���� �ϰ�, A������ C�� B�� �̼��� �Ŀ� ���� �Ѵٴ� ���Դϴ�.
������ C, B, D, A, G, E�� ������ȹ�� ¥�� ����� �� ����������
C, G, E, A, D, B ������ ®�ٸ� �� �� ����� ������ȹ�� �˴ϴ�.
������ȹ�� �� ������� �տ� ������ �̼��Ǹ� ���� ������ �����ϴٴ� ������ �ؼ��մϴ�.
������ȹ������ �� ������ ������ �̼��ȴٰ� �����մϴ�.
�ʼ���������� �־����� ������ § N���� �������谡 �ߵ� ���̸� ��YES", �߸��� ���̸� ��NO���� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù �ٿ� �� �ٿ� �ʼ������� ������ �־����ϴ�. ��� ������ ���� �빮���Դϴ�.
�� �� ° �ٺ��� ������ § �������谡 �־����ϴ�.(���������� ���̴� 30�����̴�)
���
ù �ٿ� �������谡 �ߵ� ���̸� ��YES", �߸��� ���̸� ��NO���� ����մϴ�.
*/
//�� ��
import java.util.*;

public class Q07 {
	public String solution(String str, String str2) {
		String result = "NO";
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		for (char c : str.toCharArray()) {
			q1.add(c);
		}
		for (char c : str2.toCharArray()) {
			q2.add(c);
		}

		char curr = q1.peek();
		int len = q2.size();
		// for(int i=0;i<q2.size();i++){//q2.size()�� �������̶� ����ϸ� �ȵ�.
		while (!q2.isEmpty()) {// q2.size()�� �������̶� ����ϸ� �ȵ�.
			char comp = q2.poll();
			if (curr == comp) {
				q1.poll();
				if (q1.isEmpty())
					return "YES";
				curr = q1.peek();// NullpointerException�� �߱� ���� if������ �����ش�.
			}
		}
		if (q1.isEmpty())
			return "YES";
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String str2 = in.next();
		Q07 m = new Q07();
		System.out.println(m.solution(str, str2));
	}
}