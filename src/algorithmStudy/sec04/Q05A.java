package algorithmStudy.sec04;
import java.util.*;

public class Q05A {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());// 내림차수 없을경우 그냥 new TreeSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				} // for l
			} // for j
		} // for i

		int cnt = 0;
		// Tset.remove(143); 143 값 지움
		// Tset.size(); 원소의 개수를 알려줌
		// Tset.first(); 오름차순이면 최솟값, 내림차순이면 최댓값
		// Tset.last(); 오름차순이면 최댓값, 내림차순이면 최솟값

		for (int x : Tset) {

			cnt++;
			if (cnt == k)
				return x;
			// System.out.println(x);//내림차순으로 한 값씩만 나옴
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Q05A m = new Q05A();
		System.out.println(m.solution(arr, n, k));
	}
}