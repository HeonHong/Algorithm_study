package algorithmStudy.sec02;

/*보이는 학생 
설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.

출력
선생님이 볼 수 있는 최대학생수를 출력한다.
*/
//내 답
import java.util.Scanner;

public class Q02 {
	public int solution(int[] heights, int students) {
		int result = 0;
		int minHeight = Integer.MIN_VALUE;
		for (int i = 0; i < students; i++) {
			if (heights[i] > minHeight) {
				minHeight = heights[i];
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int students = in.nextInt();
		int[] heights = new int[students];
		for (int i = 0; i < students; i++) {
			heights[i] = in.nextInt();
		}
		Q02 m = new Q02();
		System.out.println(m.solution(heights, students));

	}
}