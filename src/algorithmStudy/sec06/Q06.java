package algorithmStudy.sec06;
/*�峭�ٷ��� >> ���� ����
����
�� �бⰡ ���۵Ǿ����ϴ�. ö���� �� ¦���� ���� �ʹ� ���� �����ϴ�.
ö���� �ݿ��� N���� �л����� �ֽ��ϴ�.
�������� �� �л��鿡�� �� ��ȣ�� ���� �ֱ� ���� ��忡 �� �л����� Ű�� ���� ���� �л����� �Ϸķ� Ű������ �������ϴ�.
���� �տ� ���� ���� �л����� �� ��ȣ�� 1������ N������ �ο��մϴ�. ö���� ¦�Ẹ�� Ű�� Ů�ϴ�.
�׷��� ö���� �� ��ȣ�� �ް� �;� ¦��� �ڸ��� �ٲ���ϴ�.
�������� �� ����� �𸣰� �л��鿡�� ���ִ� ������� ��ȣ�� �ο��߽��ϴ�.
ö���� ¦���� �ڸ��� �ٲ� �� �л����� �Ϸķ� ���ִ� Ű ������ �־��� �� ö���� ���� ��ȣ�� ö�� ¦���� ���� ��ȣ��
���ʷ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� �ڿ��� N(5<=N<=100)�� �־�����.
�� ��° �ٿ� ���� �տ����� �Ϸķ� ���ִ� �л����� Ű�� �־�����.
Ű(����) �� H�� (120<=H<=180)�� �ڿ��� �Դϴ�.
���
ù ��° �ٿ� ö���� �� ��ȣ�� ¦���� �� ��ȣ�� ���ʷ� ����մϴ�.
*/

//�� ��(���� �� �̻��ѵ�?) >> ���� �� ���� ���� �߸��� �� ����. ���� Ǭ ����� ���� Ű�� �� �� ���� �� ���� �߻���.
import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int lt = 0;
		int rt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				if (lt == 0)
					lt = i;
				else
					rt = i + 1;
			}
		}
		System.out.println(lt + " " + rt);
	}
}