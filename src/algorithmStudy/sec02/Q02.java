package algorithmStudy.sec02;

/*���̴� �л� 
����
�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)

�Է�
ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.

���
�������� �� �� �ִ� �ִ��л����� ����Ѵ�.
*/
//�� ��
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