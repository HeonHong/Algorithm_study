package algorithmStudy.sec07;

import java.util.Scanner;

//이론 공부 - 재귀함수를 이용한 이진수 출력
//10진수 N이 입력되면 2진수로 변환한여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력.
public class Study02Recursion {
	public void DFS(int n) {

		if (n == 0)
			return;
		else {
			int quotient = n / 2;
			int remainder = n % 2;
			DFS(quotient);// 몫을 보내줘야함.
			System.out.print(remainder + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Study02Recursion m = new Study02Recursion();
		int n = scan.nextInt();
		m.DFS(n);
	}

}
