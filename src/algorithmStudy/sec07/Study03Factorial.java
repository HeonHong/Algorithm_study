package algorithmStudy.sec07;

import java.util.Scanner;

//이론 공부 - 팩토리얼
//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
public class Study03Factorial {
	public int DFS(int n) {
		if (n == 1)
			return 1;
		else
			return n * DFS(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study03Factorial m = new Study03Factorial();
		int n = scan.nextInt();
		System.out.println(m.DFS(n));
	}

}
