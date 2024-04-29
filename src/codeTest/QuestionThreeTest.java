package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class QuestionThreeTest {
	
	
	public static List<Integer> findClosestNumbers(List<Integer> list, int target, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Math.abs(b - target) - Math.abs(a - target));

		for (int num : list) {
			pq.offer(num);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		return new ArrayList<>(pq);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,7,2,1,4);
		List<Integer> targets = new ArrayList<Integer>();
		for(int i=0;i<1000000;i++) {
			int rand = (int)Math.random()*10;
			targets.add(rand);
		}
		int k = 3;
		long startTime = System.currentTimeMillis();
		for (int target : targets) {
			List<Integer> result = findClosestNumbers(list, target, k);
			System.out.println("Target: " + target + ", Closest numbers: " + result);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
