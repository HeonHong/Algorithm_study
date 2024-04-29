package codeTest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class QuestionFour {
	private static double[][] table;

	// ��ǥ�� ���� ���� Ȯ��
	public boolean isCoordExist(int[][] coordinate, double[] temp, int x, int y) {

		for (int i = 0; i < coordinate.length; i++) {
			if (coordinate[i][0] == x && coordinate[i][1] == y) {
				table[x][y] = temp[i];
				return true;
			}
		}
		return false;
	}

	// ����ġ ��
	public double calcWSum(int[][] coordinate, int x, int y) {
		double result = 0;
		for (int i = 0; i < coordinate.length; i++) {
			int xPow = (int) Math.pow((coordinate[i][0] - x) * 30, 2);
			int yPow = (int) Math.pow((coordinate[i][1] - y) * 30, 2);
			result += 1.0 / (xPow + yPow);
		}
		return result;
	}

	// ���ڰ�*����ġ ��
	public double calcZWSum(int[][] coordinate, double[] temp, int x, int y) {
		double result = 0;
		for (int i = 0; i < coordinate.length; i++) {
			int xPow = (int) Math.pow((coordinate[i][0] - x) * 30, 2);
			int yPow = (int) Math.pow((coordinate[i][1] - y) * 30, 2);
			result += temp[i] / (xPow + yPow);
		}
		return result;
	}

	public static void main(String[] args) {
		QuestionFour q = new QuestionFour();
		// ���� �ϴ��� 0,0 ���� ����
		int[][] coordinate = { { 3, 1 }, { 6, 2 }, { 0, 3 }, { 7, 5 }, { 3, 7 } };
		double[] temp = { 14.3, 12.9, 14.0, 10.8, 11.2 };

		table = new double[9][9];

		for (int i = 0; i < table.length; i++) {// y��ǥ

			for (int j = 0; j < table[i].length; j++) {// x��ǥ
				double wSum = 0;
				double zwSum = 0;

				// ��ǥ�� ���� ���� Ȯ��
				if (q.isCoordExist(coordinate, temp, j, i)) continue;

				// ��ǥ�� ���� ���
				wSum = q.calcWSum(coordinate, j, i);
				zwSum = q.calcZWSum(coordinate, temp, j, i);
				int tmp = (int) (zwSum / wSum * 10);
				table[j][i] = tmp / 10.0;

			} // for j
		} // for i

		String file = "C:\\Users\\ghdgj\\Desktop\\tempData.txt";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < table.length; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < table[i].length; j++) {
					sb.append(String.format("%6.1f", table[j][i]));

				}
				bw.write(sb.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
