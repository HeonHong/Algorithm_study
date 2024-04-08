package algorithmStudy.sec02;

/*���丵 
����
������ �� �������� �� �л����� ���������� ����Ű�� ���� ���丵 �ý����� ������� �մϴ�.
���丵�� ����(�����ִ� �л�)�� ��Ƽ(������ �޴� �л�)�� �� ¦�� �Ǿ� ���䰡 ��Ƽ�� ���а��θ� �����ִ� ���Դϴ�.
�������� M���� �����׽�Ʈ ����� ������ ����� ��Ƽ�� ���մϴ�.
���� A�л��� �����̰�, B�л��� ��Ƽ�� �Ǵ� ¦�� �Ǿ��ٸ�, A�л��� M���� �����׽�Ʈ���� ��� B�л����� ����� �ռ��� �մϴ�.
M���� ���м����� �־����� ����� ��Ƽ�� �Ǵ� ¦�� ���� �� �ִ� ��찡 �� �� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� �� �л� �� N(1<=N<=20)�� M(1<=M<=10)�� �־�����.
�� ��° �ٺ��� M���� �ٿ� ���� �����׽�Ʈ ����� �л���ȣ�� �־�����. �л���ȣ�� ���� �տ������� 1��, 2��, ...N�� ������ ǥ���ȴ�.
���� �� �ٿ� N=4�̰�, �׽�Ʈ ����� 3 4 1 2�� �ԷµǾ��ٸ� 3�� �л��� 1��, 4�� �л��� 2��, 1�� �л��� 3��, 2�� �л��� 4���� �ǹ��մϴ�.
���
ù ��° �ٿ� ¦�� ���� �� �ִ� �� ��츦 ����մϴ�.*/

//�� ��
import java.util.Scanner;

public class Q11 {
	public int solution(int[][] rank, int students, int num) {
		int result = 0;

		// 0�� �迭�� 0���̶� 1��
		// 1�� �迭�� 0�� �� �ε����� 1�� �� �ε���

		for (int i = 0; i < students; i++) {
			int curr = rank[0][i];

			for (int j = i + 1; j < students; j++) {
				int comp = rank[0][j];
				boolean isTrue = true;
				for (int k = 1; k < num; k++) {
					for (int l = 0; l < students; l++) {
						if (rank[k][l] == curr)
							break;
						if (rank[k][l] == comp) {
							isTrue = false;
							break;
						}
					} // for l
					if (!isTrue)
						break;
				} // for k
				if (isTrue)
					result++;
			} // for j

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int students = in.nextInt();
		int num = in.nextInt();

		int[][] rank = new int[num][students];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < students; j++) {
				rank[i][j] = in.nextInt();
			}
		}
		Q11 m = new Q11();

		System.out.print(m.solution(rank, students, num));

	}
}