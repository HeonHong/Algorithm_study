package algorithmStudy.sec08;

import java.util.*;

/*���� ���� �κ�����(DFS : �Ƹ��� ���ͺ�)
����
N���� ���ҷ� ������ �ڿ��� ������ �־�����, �� ������ �� ���� �κ��������� �������� ��
�� �κ������� ������ ���� ���� ���� ��찡 �����ϸ� ��YES"�� ����ϰ�, �׷��� ������ ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ѷ� ������ �� �κ������� ���μ� �����̸�, �� �κ������� ���ϸ� �Է����� �־��� ������ ������ �Ǿ� �մϴ�.
���� ��� {1, 3, 5, 6, 7, 10}�� �ԷµǸ� {1, 3, 5, 7} = {6, 10} ���� �� �κ������� ���� 16���� ���� ��찡 �����ϴ� ���� �� �� �ִ�.

�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=10)�� �־����ϴ�.
�� ��° �ٿ� ������ ���� N���� �־�����. �� ���Ҵ� �ߺ����� �ʴ´�.

���
ù ��° �ٿ� ��YES" �Ǵ� ��NO"�� ����Ѵ�. */
public class Q01 {
	static int[] ch;

	public String DFS(int[] arr, int prevSum) {
		String answer = "NO";
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ch[i] == 0)
				sum += arr[i];
		}
		if (sum == prevSum) {
			return "YES";
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					prevSum += arr[i];
					answer = DFS(arr, prevSum);
					if (answer == "YES")
						return "YES";
					prevSum -= arr[i];
					ch[i] = 0;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Q01 t = new Q01();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];
		ch = new int[n];
		ch[0] = 1;
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		System.out.println(t.DFS(arr, arr[0]));
	}

}
