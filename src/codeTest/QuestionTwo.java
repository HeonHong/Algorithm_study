package codeTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class QuestionTwo {
	
	//�߻��� Ȯ�� �Լ�
	public Queue<String> solution(ArrayList<String> date, ArrayList<Double> temp, ArrayList<Double> hmdty) {
		Queue<String> pcDate = new LinkedList<String>();// ������
		HashMap<Integer, Boolean> pcCheck = new HashMap<Integer, Boolean>(); //�ֱ� 7�ϰ� �� �߻�����
		double Av7TD;
		double Av5RH;
		double tdSum = 0;
		double rhSum = 0;
		
		//4�� 7�ϱ����� 7�ϰ��� ��ձ�� ��, 5�ϰ��� ��� ������ �� ����
		for (int i = 0; i < 7; i++) {
			tdSum += temp.get(i);
			if (i > 1)
				rhSum += hmdty.get(i);
		}
		
		//4�� 7�Ϻ��� �� �߻����� Ȯ��
		for (int i = 6; i < temp.size(); i++) {
			if (i != 6) {
				tdSum = tdSum + temp.get(i) - temp.get(i - 7);
				rhSum = rhSum + hmdty.get(i) - hmdty.get(i - 5);
			}
			Av7TD = tdSum / 7;
			Av5RH = rhSum / 5;

			if (Av7TD > 12 && Av5RH > 80) {
				pcCheck.put((i + 1) % 7, true);
			} else {
				pcCheck.put((i + 1) % 7, false);
			}
			
			//4�� 13�Ϻ��� ���� 7�� ���߻� ���� Ȯ�� ����
			if (pcCheck.size() == 7 && !pcCheck.containsValue(false)) {
				pcDate.offer(date.get(i));
			}
		}

		return pcDate;
	}

	public static void main(String[] args) {

		String path = "C:\\Users\\ghdgj\\Desktop\\OBS_ASOS_DD_20240420042152.csv";
		BufferedReader br = null;
		File csvFile = new File(path);
		try {
			//�������� �䱸�� �����͸� �����Ͽ� csv�� ����, ������,	�Ͻ�,	��ձ��(��C),��� ������(%) �ุ ������ �ִٰ� ����
			br = new BufferedReader(new FileReader(path));
			br.readLine();// ����� ���� �� ����
			
			ArrayList<String> date = new ArrayList<String>();// ��¥
			ArrayList<Double> temp = new ArrayList<Double>();// �Ϻ� ��� ���
			ArrayList<Double> hmdty = new ArrayList<Double>();// �Ϻ� ��� ������
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] rowData = line.split(",");
				date.add(rowData[2]);
				temp.add(Double.parseDouble(rowData[3]));
				hmdty.add(Double.parseDouble(rowData[4]));
			}

			QuestionTwo q = new QuestionTwo();
			Queue<String> pcDate = q.solution(date, temp, hmdty); // ������

//			�ܼ� ��� �ʿ��� ��� �ּ� ���� �� ����
//			for (String x : pcDate) {
//				System.out.println(x);
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
