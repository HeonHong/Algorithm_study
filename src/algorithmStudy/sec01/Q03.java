package algorithmStudy.sec01;

/*���� �� �ܾ�
����
�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
������� �� �ܾ�� �������� ���е˴ϴ�.

�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
*/
//�� ��
import java.util.Scanner;

public class Q03 {
	public String splitString(String input1) {
		String result = "";
		String[] strArr = input1.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			result = (result.length() < strArr[i].length()) ? strArr[i] : result;

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		Q03 m = new Q03();
		System.out.println(m.splitString(input1));
	}
}