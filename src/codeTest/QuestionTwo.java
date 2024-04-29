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
	
	//발생일 확인 함수
	public Queue<String> solution(ArrayList<String> date, ArrayList<Double> temp, ArrayList<Double> hmdty) {
		Queue<String> pcDate = new LinkedList<String>();// 방제일
		HashMap<Integer, Boolean> pcCheck = new HashMap<Integer, Boolean>(); //최근 7일간 병 발생여부
		double Av7TD;
		double Av5RH;
		double tdSum = 0;
		double rhSum = 0;
		
		//4월 7일까지의 7일간의 평균기온 합, 5일간의 평균 상대습도 합 세팅
		for (int i = 0; i < 7; i++) {
			tdSum += temp.get(i);
			if (i > 1)
				rhSum += hmdty.get(i);
		}
		
		//4월 7일부터 병 발생여부 확인
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
			
			//4월 13일부터 연속 7일 병발생 여부 확인 가능
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
			//문제에서 요구한 데이터만 추출하여 csv는 지점, 지점명,	일시,	평균기온(°C),평균 상대습도(%) 행만 가지고 있다고 가정
			br = new BufferedReader(new FileReader(path));
			br.readLine();// 헤더행 삭제 후 시작
			
			ArrayList<String> date = new ArrayList<String>();// 날짜
			ArrayList<Double> temp = new ArrayList<Double>();// 일별 평균 기온
			ArrayList<Double> hmdty = new ArrayList<Double>();// 일별 평균 상대습도
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] rowData = line.split(",");
				date.add(rowData[2]);
				temp.add(Double.parseDouble(rowData[3]));
				hmdty.add(Double.parseDouble(rowData[4]));
			}

			QuestionTwo q = new QuestionTwo();
			Queue<String> pcDate = q.solution(date, temp, hmdty); // 방제일

//			콘솔 출력 필요할 경우 주석 해제 후 실행
//			for (String x : pcDate) {
//				System.out.println(x);
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
