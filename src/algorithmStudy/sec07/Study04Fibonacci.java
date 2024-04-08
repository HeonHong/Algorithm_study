package algorithmStudy.sec07;

import java.util.Scanner;

//이론 공부 - 피보나치 수열
//스택프레임 이용하기 때문에 for문보다 성능이 좋을 수가 없음.
public class Study04Fibonacci {
	static int[] fibo;

	public int DFS(int n) {
//		if (n == 1)
//			return 1;
//		else if (n == 2)
//			return 1;
//		else
//			return DFS(n - 2) + DFS(n - 1);

		// 메모이제이션
		if (fibo[n] > 0)
			return fibo[n];

		// 모든 값을 저장할 경우
		if (n == 1)
			return fibo[n] = 1;
		else if (n == 2)
			return fibo[n] = 1;
		else
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
	}

//	합 구할 경우
//	public int sum(int n) {
//		if (n == 0)
//			return 0;
//		else
//			return sum(n - 1) + DFS(n);
//	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study04Fibonacci m = new Study04Fibonacci();
		int n = scan.nextInt();

		// 모든 값을 저장할 경우
		fibo = new int[n + 1];
		m.DFS(n);
		for (int i = 1; i <= n; i++)
			System.out.println(fibo[i] + " ");
	}

}
