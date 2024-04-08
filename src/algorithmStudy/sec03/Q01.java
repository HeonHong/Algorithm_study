package algorithmStudy.sec03;

/*�� �迭 ��ġ��(Two Pointers �˰���)
����
������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.
�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.
�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.
���
*/
//�� ��
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] arr1, int[] arr2, int n1, int n2) {
		int[] answer = new int[n1 + n2];
		// List<Integer> list = Arrays.asList(arr1);//int �迭�� asList�Ұ�
		// list.add(Arrays.asList(arr2)); �� ��� ��� ������ Ȯ��//String�� �� list���¸� String����
		// �ٲ� �� ��� ������
		for (int i = 0; i < n1; i++) {
			answer[i] = arr1[i];
		} // for i
		for (int i = n1; i < answer.length; i++) {
			answer[i] = arr2[i - n1];
		} // fori
		for (int i = 0; i < answer.length; i++) {// �����ε���
			for (int j = i + 1; j < answer.length; j++) {
				int temp = 0;
				if (answer[i] > answer[j]) {
					temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				} // if
			} // for j
		} // for i

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int[] arr1 = new int[n1];

		for (int i = 0; i < n1; i++) {
			arr1[i] = in.nextInt();
			;
		}
		int n2 = in.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
			;
		}
		Q01 m = new Q01();
		for (int x : m.solution(arr1, arr2, n1, n2)) {
			System.out.print(x + " ");
		}
	}
}
