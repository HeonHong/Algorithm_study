package algorithmStudy.sec02;

//������ �ִ��� (����)
//����
//5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.
//N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.
//
//�Է�
//ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
//�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
//
//���
//�ִ����� ����մϴ�.

import java.util.Scanner;

public class Q09 {
	public int solution(int[][] score, int num) {
		int result = Integer.MIN_VALUE;

		int cross = 0;
		int rCross = 0;
		// �밢�� ��
		for (int i = 0; i < num; i++) {
			cross += score[i][i];
			rCross += score[i][num - i - 1];
		}
		result = Math.max(result, cross);
		result = Math.max(result, rCross);
		for (int i = 0; i < num; i++) {
			int row = 0;// ���� ��
			int col = 0;// ���� ��
			for (int j = 0; j < num; j++) {
				row += score[i][j];
				col += score[j][i];
			}
			result = Math.max(result, row);
			result = Math.max(result, col);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] score = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {// ī���� �� ������ ��
				score[i][j] = in.nextInt();
			}
		}
		Q09 m = new Q09();

		System.out.print(m.solution(score, num));

	}
}