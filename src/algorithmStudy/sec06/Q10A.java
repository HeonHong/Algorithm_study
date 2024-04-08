package algorithmStudy.sec06;

import java.util.Arrays;
import java.util.Scanner;

/*
������ ���ϱ�(�����˰���)
����
N���� �������� �������� �ֽ��ϴ�. �� �������� x1, x2, x3, ......, xN�� ��ǥ�� ������, ���������� ��ǥ�� �ߺ��Ǵ� ���� �����ϴ�.
������ C������ ���� ������ �ִµ�, �� ������ ���� ������ �ִ� ���� �������� �ʽ��ϴ�. �� ���������� �� ������ ���� ���� �� �ְ�,
���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.
C������ ���� N���� �������� ��ġ���� �� ���� ����� �� ���� �Ÿ��� �ִ밡 �Ǵ� �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù �ٿ� �ڿ��� N(3<=N<=200,000)�� C(2<=C<=N)�� ������ ���̿� �ΰ� �־����ϴ�.
��° �ٿ� �������� ��ǥ xi(0<=xi<=1,000,000,000)�� ���ʷ� �־����ϴ�.
���
ù �ٿ� ���� ����� �� ���� �ִ� �Ÿ��� ����ϼ���.*/

//���� ��
public class Q10A {
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= dist) {
				ep = arr[i];
				cnt++;
			}
		}
		return cnt;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n - 1];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// ������ ĭ ��
		int c = in.nextInt();// ���� ��
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q10A t = new Q10A();
		System.out.println(t.solution(n, c, arr));
	}

}
