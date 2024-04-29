package codeTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class QuestionOne {
	// 월 표준편차
	public double calcStdDev(float[] temp, double avg, int day, int curr) {

		double sum = 0;

		for (int i = curr; i < (curr + day); i++) {
			sum += Math.pow((temp[i] - avg), 2);
		}

		double var = sum / day;

		return Math.sqrt(var);
	}

	// 월 평균 온도
	public double calcAvg(float[] temp, int day, int curr) {

		double sum = 0;

		for (int i = curr; i < (curr + day); i++) {
			sum += temp[i];
		}

		return sum / day;
	}

	// 해당 로직에서는 의사난수 방지 처리X
	public static void main(String[] args) {
		QuestionOne q = new QuestionOne();
		Date fstDay;
		Date lstDay;

		try {
			fstDay = new SimpleDateFormat("yyyyMMdd").parse("20230101");
			lstDay = new SimpleDateFormat("yyyyMMdd").parse("20240101");
			int day = (int) ((lstDay.getTime() - fstDay.getTime()) / (1000 * 60 * 60 * 24));
			float[] temp = new float[day];

			for (int i = 0; i < day; i++) {
				float rand = (float) ((Math.random() * 41) - 10);
				if (rand > 30.0)
					rand -= 1;
				temp[i] = (float) (Math.round(rand * 10) / 10.0);
			}

			int months = 12;
			double[] avg = new double[months];
			double[] stdDev = new double[months];

			int curr = 0;

			for (int i = 0; i < months; i++) {
				LocalDate date = LocalDate.of(2023, i + 1, 1);
				int mDay = date.lengthOfMonth();
				avg[i] = q.calcAvg(temp, mDay, curr);
				stdDev[i] = q.calcStdDev(temp, avg[i], mDay, curr);
				curr += mDay;
			}

			System.out.println(String.format("%16s", "월") + String.format("%16s", "평균") + String.format("%16s", "표준편차"));
			for (int i = 0; i < avg.length; i++) {
				String date = (i < 9) ? "2023-0" + (i + 1) : "2023-" + (i + 1);
				System.out.println(String.format("%16s", date) + String.format("%16.3f", avg[i])+ String.format("%16.3f", stdDev[i]));

			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
