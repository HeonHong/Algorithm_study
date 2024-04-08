package algorithmStudy.sec07;

import java.util.*;

//이론 공부 - 재귀함수
//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하느 프로그램을 작성하세요.
//재귀함수는 StackFrame을 사용한다.
//Keyword. 매개변수, 지역변수, 복귀주소
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
