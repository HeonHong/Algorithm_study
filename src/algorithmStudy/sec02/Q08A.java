package algorithmStudy.sec02;

import java.util.Scanner;

public class Q08A {
	public void solution(int[] score, int num) {
		int[] temp = new int[num];
		System.arraycopy(score, 0, temp, 0, score.length);

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (temp[i] < temp[j]) {
					int t = temp[j];
					temp[j] = temp[i];
					temp[i] = t;
				}
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (score[i] == temp[j]) {
					System.out.print((j + 1) + " ");
					break;
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] score = new int[num];
		for (int i = 0; i < num; i++) {
			score[i] = in.nextInt();
		}
		Q08A m = new Q08A();

		m.solution(score, num);

	}
}