package algorithmStudy.sec01;

/*���� ª�� ���ڰŸ�
����
�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
���ڿ��� ���̴� 100�� ���� �ʴ´�.

���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
*/
//�� ��
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		int[] arrNum = new int[input1.length()];
		// int[] result = new int[input1.length()];
		int temp = 0;

		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == input2) {
				arrNum[temp] = i;
				temp++;
			}
		}
		temp = -1;
		for (int i = 0; i < input1.length(); i++) {
			int result = 0;
			if (input1.charAt(i) == input2) {
				result = 0;
				temp++;
			} else {
				result = (temp < 0) ? Math.abs(i - arrNum[0])
						: Math.min(Math.abs(i - arrNum[temp]), Math.abs(arrNum[temp + 1] - i));
			}
			System.out.print(result + " ");
		}

	}
}