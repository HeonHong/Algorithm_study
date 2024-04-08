package algorithmStudy.sec03;

/*두 배열 합치기(Two Pointers 알고리즘)
설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
출력
*/
//내 답
import java.util.Scanner;

public class Q01 {
	public int[] solution(int[] arr1, int[] arr2, int n1, int n2) {
		int[] answer = new int[n1 + n2];
		// List<Integer> list = Arrays.asList(arr1);//int 배열은 asList불가
		// list.add(Arrays.asList(arr2)); 이 경우 어떻게 들어가는지 확인//String일 때 list형태를 String으로
		// 바꿀 수 없어서 오류남
		for (int i = 0; i < n1; i++) {
			answer[i] = arr1[i];
		} // for i
		for (int i = n1; i < answer.length; i++) {
			answer[i] = arr2[i - n1];
		} // fori
		for (int i = 0; i < answer.length; i++) {// 기준인덱스
			for (int j = i + 1; j < answer.length; j++) {
				int temp = 0;
				if (answer[i] > answer[j]) {
					temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				} // if
			} // for j
		} // for i

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int[] arr1 = new int[n1];

		for (int i = 0; i < n1; i++) {
			arr1[i] = in.nextInt();
			;
		}
		int n2 = in.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
			;
		}
		Q01 m = new Q01();
		for (int x : m.solution(arr1, arr2, n1, n2)) {
			System.out.print(x + " ");
		}
	}
}
