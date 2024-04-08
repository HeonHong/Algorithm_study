package algorithmStudy.sec06;

import java.util.Arrays;
import java.util.Scanner;

/*
마구간 정하기(결정알고리즘)
설명
N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
입력
첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
출력
첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.*/

//내 답
public class Q10 {
	public int putCheck(int[] arr, int c, int mid) {
		int temp = arr[0];
		c--;
		for (int i = 1; i < arr.length; i++) {
			if (temp + mid <= arr[i]) {
				c--;
				temp = arr[i];
				if (c == 0)
					break;
			}
		}
		return c;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);

		// lt=arr[0]로 하게 되면 만약에 시작값이 최대 거리보다 클 경우 답을 구할 수 없다.
		int lt = 1, rt = arr[n - 1] - arr[0];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (putCheck(arr, c, mid) == 0) {
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
		int n = in.nextInt();// 마구간 칸 수
		int c = in.nextInt();// 말의 수
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Q10 t = new Q10();
		System.out.println(t.solution(n, c, arr));
	}
}
