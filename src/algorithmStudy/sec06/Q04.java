package algorithmStudy.sec06;

/*6-4. Least Recently Used 18��
����
ĳ�ø޸𸮴� CPU�� �ֱ����ġ(DRAM) ������ ����� �ӽ� �޸𸮷μ� CPU�� ó���� �۾��� ������ ���Ҵٰ�
�ʿ��� �ٷ� ����ؼ� ó���ӵ��� ���̴� ��ġ�̴�. ���� ��ΰ� �뷮�� �۾� ȿ�������� ����ؾ� �Ѵ�.
ö���� ��ǻ�ʹ� ĳ�ø޸� ��� ��Ģ�� LRU �˰����� ������.
LRU �˰����� Least Recently Used �� ���ڷ� �������ڸ� ���� �ֱٿ� ������ ���� �� ������ �ǹ̸� ������ �ֽ��ϴ�.
ĳ�ÿ��� �۾��� ������ �� ���� �������� ������� ���� ���� �����ϰڴٴ� �˰����Դϴ�.

ĳ���� ũ�Ⱑ �־�����, ĳ�ð� ����ִ� ���¿��� N���� �۾��� CPU�� ���ʷ� ó���Ѵٸ� N���� �۾��� ó���� ��
ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʴ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� ĳ���� ũ���� S(3<=S<=10)�� �۾��� ���� N(5<=N<=1,000)�� �Էµȴ�.
�� ��° �ٿ� N���� �۾���ȣ�� ó�������� �־�����. �۾���ȣ�� 1 ~100 �̴�.
���
������ �۾� �� ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʷ� ����մϴ�.

*/
import java.util.*;

public class Q04 {
	public Deque solution(int s, int n, int[] arr) {
		Deque<Integer> deque = new LinkedList<>();
		HashSet<Integer> hashset = new HashSet<>();
		for (int x : arr) {
			if (!hashset.contains(x)) {
				if (deque.size() == s) {
					hashset.remove(deque.poll());
				}
			} else {
				deque.removeFirstOccurrence(x);
			}
			deque.offer(x);
			hashset.add(x);

		}
		return deque;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q04 m = new Q04();
		Deque result = m.solution(s, n, arr);
		for (int i = 0; i < s; i++) {
			System.out.print(result.pollLast() + " ");
		}

	}
}