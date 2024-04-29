package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class QuestionThree2 {
	public List<Integer> solution(List<Integer> prodList, int req) {
		List<Integer> result = new ArrayList<>();
		//정확한 배열 값 없을 경우 방지
		int index = Collections.binarySearch(prodList, req);
		//out of bounds 방지
		if(index<0) index+=1;
		index = Math.abs(index);
		int	rt = index>(prodList.size()-1)?prodList.size()-1:index;
		int	lt = (index-1)<=0?0:index-1;

		while (result.size() < 3) {
			int ltCalc = req - prodList.get(lt);
			int rtCalc = prodList.get(rt) - req;
			if (ltCalc < rtCalc) {
				result.add(prodList.get(lt));
				if (lt > 0)
					lt--;
			} else {
				result.add(prodList.get(rt));
				if (rt < prodList.size() - 1)
					rt++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		QuestionThree2 q = new QuestionThree2();
		List<Integer> prodList = new ArrayList<Integer>(Arrays.asList(6, 7, 2, 1, 4));
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int[] req = new int[1000000];
		for (int i = 0; i < req.length; i++)
			req[i] = (int) (Math.random() * 10);

		// 시간 측정
		long startTime = System.currentTimeMillis();
		Collections.sort(prodList);
		for (int x : req) {
			result.add(q.solution(prodList, x));
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000+"초");
	}

}
