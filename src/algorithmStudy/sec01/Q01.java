package algorithmStudy.sec01;

/*���� ã��
����
�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

���
ù �ٿ� �ش� ������ ������ ����Ѵ�.*/
//�� ��
import java.util.Scanner;

public class Q01 {
	private int cnt(String input1, String input2) {
		int num = 0;
		input1 = input1.toLowerCase();
		char input2c = input2.toLowerCase().charAt(0);
		for (int i = 0; i < input1.length(); i++) {
			num = (input2c == input1.charAt(0)) ? num + 1 : num;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		Q01 m = new Q01();
		int num = m.cnt(input1, input2);
		System.out.println(num);
	}
}