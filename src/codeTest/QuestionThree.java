package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QuestionThree {
	/*
	 * ĳ�� ó���� �õ��Ϸ��� ������ �ð��� �����Ǿ� ����� ������ �� ���� �� ���� �ʾ� �����Ͽ����ϴ�. Ȥ�� �������ôٸ� ���� �� ���� ���ֽ� �� �������? 
	 * �׸��� �� ������ ���, ������ ���� Ž���� �����ϰ� �����Ϸ��� �����ϰ� �� ������� �����ߴµ�, ���� Ž���� �����ϰ� ���� ������ �������?
	 */
/*
	// ĳ��
	public static int[] reqCache;
	public static List<Integer>[] cache;

	// LRU
	public synchronized List<Integer> checkCache(int req) {
		int pos = -1;
		int tmp = -1;
		List resultTmp = new ArrayList<>();
		for (int i = 0; i < reqCache.length; i++) {
			if (reqCache[i] == 0)
				return null;
			if (reqCache[i] == req) {
				pos = i;
				tmp = req;
				resultTmp = cache[i];
				break;
			}
		}

		if (pos != -1) {
			for (int i = pos; i >= 1; i--) {
				reqCache[i] = reqCache[i - 1];
				cache[i] = cache[i - 1];
			}
			reqCache[0] = tmp;
			cache[0] = resultTmp;
			return resultTmp;
		}
		return null;
	}

	// ĳ�� ����
	public synchronized void saveCache(int req, List<Integer> result) {
		for (int i = 1; i < reqCache.length; i++) {
			reqCache[i] = reqCache[i - 1];
			cache[i] = cache[i - 1];
		}
		reqCache[0] = req;
		cache[0] = result;
	}
*/
	public List<Integer> solution(ArrayList<Integer> prodList, int req) {
		List<Integer> result = new ArrayList<Integer>();
//		if((result=checkCache(req))!=null) return result;
		Collections.sort(prodList, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return Math.abs(a - req) - Math.abs(b - req);
			}
		});
		for (int i = 0; i < 3; i++) {
			result.add(prodList.get(i));
		}
//		saveCache(req,result);
		return result;
	}

	public static void main(String[] args) {
//		ĳ�� ������ 5 ����
//		reqCache = new int[5];
//		cache = new List[5];

		QuestionThree q = new QuestionThree();
		ArrayList<Integer> prodList = new ArrayList<Integer>(Arrays.asList(6, 7, 2, 1, 4));
		ArrayList<Integer> reqList = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			int rand = (int) (Math.random() * 9 + 1);
			reqList.add(rand);
		}

		//������ ����
		int num = 100;
		ExecutorService executor = Executors.newFixedThreadPool(num);
		List<Future<List<Integer>>> futures = new ArrayList<>();

		//�ð� ����
		long startTime = System.currentTimeMillis();

		//�����庰 �Լ� ����
		for (int req : reqList) {
			futures.add(executor.submit(new Callable<List<Integer>>() {
				@Override
				public List<Integer> call() throws Exception {
					return q.solution(new ArrayList<Integer>(prodList), req);
				}
			}));
		}

		executor.shutdown();

		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) / 1000);
	}

}
