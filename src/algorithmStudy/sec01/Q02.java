package algorithmStudy.sec01;

/*��ҹ��� ��ȯ
����
�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
*/
//�� ��
import java.util.Scanner;

public class Q02 {
	private String changeCase(String input1) {
		String result = "";
		String inputC = input1.toLowerCase();
		for (int i = 0; i < input1.length(); i++) {
			result += (inputC.charAt(i) == input1.charAt(i)) ? inputC.toUpperCase().charAt(i) : inputC.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		Q02 m = new Q02();
		System.out.println(m.changeCase(input1));
	}
}