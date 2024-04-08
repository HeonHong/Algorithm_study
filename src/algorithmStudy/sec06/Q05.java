package algorithmStudy.sec06;

import java.util.*;

/*�ߺ� Ȯ�� 3��
����
������ �ݿ��� N���� �л����� �ֽ��ϴ�.
�������� �� �л��鿡�� 1���� 10,000,000������ �ڿ��� �߿��� ���ڰ� �����ϴ� ���� �ϳ� ���� ����� �߽��ϴ�.
���� N���� �л����� ��� ���� �� �ߺ��� ���ڰ� �����ϸ� D(duplication)�� ����ϰ�,
N���� ��� ���� �ٸ� ���ڸ� ����´ٸ� U(unique)�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� �ڿ��� N(5<=N<=100,000)�� �־�����.
�� ��° �ٿ� �л����� ���� �� N���� �ڿ����� �Էµȴ�.
���
ù ��° �ٿ� D �Ǵ� U�� ����Ѵ�.*/
//�� ��
public class Q05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<Integer> hashset = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hashset.add(in.nextInt());
		}
		String result = (hashset.size() == n) ? "U" : "D";
		System.out.println(result);
	}

}
