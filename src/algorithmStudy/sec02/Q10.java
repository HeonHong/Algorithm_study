package algorithmStudy.sec02;

/*���츮
����
���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.

�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
���
���츮�� ������ ����ϼ���.*/

//�� ��
import java.util.Scanner;

public class Q10 {
	public int solution(int[][] score, int num) {
		int result = 0;
		for (int i = 1; i < score.length - 1; i++) {
			for (int j = 1; j < score.length - 1; j++) {
				boolean isTrue = score[i][j] > score[i - 1][j] && score[i][j] > score[i][j + 1]
						&& score[i][j] > score[i][j - 1] && score[i][j] > score[i + 1][j];// �̷��� �� ���� �ְ����� ���࿡ �밢�� ���⵵
																							// ����ؾ��� ��� 8���� ���ǹ��� �ʿ��ϰ�
																							// �ȴ�.
				if (isTrue)
					result++;

			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] score = new int[num + 2][num + 2];
		for (int i = 1; i < score.length - 1; i++) {
			for (int j = 1; j < score.length - 1; j++) {
				score[i][j] = in.nextInt();
			}
		}
		Q10 m = new Q10();

		System.out.print(m.solution(score, num));

	}
}