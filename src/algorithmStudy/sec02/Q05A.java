package algorithmStudy.sec02;

//���� ��
import java.util.Scanner;

public class Q05A {
	public int solution(int n) {
		int answer = 0;

		int[] ch = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (ch[i] == 0) {
				answer++;
				for (int j = i; j <= n; j = j + i) {// �� �κ� �߿� i�� ����� �����ؾ��ϴϱ�
					ch[j] = 1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Q05A m = new Q05A();

		System.out.print(m.solution(n));

	}
}