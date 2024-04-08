package algorithmStudy.sec05;

//���� ��
import java.util.*;

public class Q08A {
	public int solution(int n, int m, int[] arr) {
		int answer = 1;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for (Person x : q) {
				if (x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				if (tmp.id == m)
					return answer;
				else
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Q08A t = new Q08A();
		System.out.println(t.solution(n, m, arr));
	}
}

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

}
/*
 * //class �߰� �� ������ �� Java ���� ������ ���� Ŭ������ ���� �� �����ؾ� �� ���� ������ ������ �����ϴ�: 1. �ϳ���
 * public Ŭ������ ���: Java ���Ͽ��� public Ŭ������ �ϳ��� �����ؾ� �մϴ� 1. ���� ���� ���� public Ŭ������
 * �����ϸ� ������ ������ �߻��մϴ� 1. 2. �ҽ� ���� �̸��� public Ŭ���� �̸� ��ġ: �ҽ� ������ �̸��� public Ŭ������
 * �̸��� ��ġ�ؾ� �մϴ� 2. ���� ��ġ���� ������, ��Ŭ������ ���� IDE���� �ڵ� ������ �� �� �� �ֽ��ϴ� 2. 3. ������ ����:
 * �ϳ��� ���Ͽ� ���� Ŭ������ �ۼ��ϸ� �������� ������ �� �ֽ��ϴ� 3. ���� �����ϸ� �ϳ��� �ҽ� ���Ͽ��� �ϳ��� Ŭ������ �ۼ��ϴ� ����
 * �ٶ����մϴ� 2. 4. ������ ����: �ڹٽ�ũ��Ʈ�� �޸� �ڹٴ� �������� �ʿ��ϸ�, �̷� ���� �Ϻ� ������� �����մϴ� 4. ��Ŭ������
 * ����ϸ� �ҽ� �ڵ� ������ ������ ������ �ڵ����� �������� ��������, �̴� IDE�� ���� �ٸ� �� �ֽ��ϴ� 4. �̷��� ������ ����Ͽ�
 * Ŭ������ �ۼ��ϸ� �� �� ȿ������ ���α׷����� �����մϴ�.
 */