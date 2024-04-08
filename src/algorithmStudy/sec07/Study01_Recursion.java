package algorithmStudy.sec07;

import java.util.*;

//�̷� ���� - ����Լ�
//�ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//����Լ��� StackFrame�� ����Ѵ�.
//Keyword. �Ű�����, ��������, �����ּ�
public class Study01_Recursion {
	public void DFS(int n) {
		if (n == 0)
			return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study01_Recursion m = new Study01_Recursion();
		int n = scan.nextInt();
		m.DFS(n);
	}

}
