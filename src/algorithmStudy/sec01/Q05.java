package algorithmStudy.sec01;

/*Ư������ ������
����
���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.

���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.*/

//�� ��
import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		char[] orgArry = input1.toCharArray();
		char[] uppArry = input1.toUpperCase().toCharArray();
		char[] resultArry = new char[input1.length()];
		int temp = 0;
		for (int i = 0; i < uppArry.length; i++) {
			if (resultArry[i] == '\0') {
				if (uppArry[i] >= 65 && uppArry[i] <= 95) {
					for (int j = temp; j < uppArry.length; j++) {
						temp++;
						if (uppArry[uppArry.length - temp] >= 65 && uppArry[uppArry.length - temp] <= 95) {
							resultArry[i] = orgArry[uppArry.length - temp];
							resultArry[uppArry.length - temp] = orgArry[i];
							break;
						}
					}
				} else {
					resultArry[i] = orgArry[i];
				}
			}

		}
		String result = String.valueOf(resultArry);
		System.out.println(result);
	}
}
