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
	 * 캐시 처리를 시도하려고 했으나 시간이 한정되어 제대로 구현할 수 있을 거 같지 않아 삭제하였습니다. 혹시 괜찮으시다면 조언 한 번만 해주실 수 있을까요? 
	 * 그리고 이 문제의 경우, 기존에 이진 탐색을 생각하고 진행하려다 실패하고 이 방식으로 구현했는데, 이진 탐색을 생각하고 내신 문제가 맞을까요?
	 */
/*
	// 캐시
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

	// 캐시 저장
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
//		캐시 사이즈 5 설정
//		reqCache = new int[5];
//		cache = new List[5];

		QuestionThree q = new QuestionThree();
		ArrayList<Integer> prodList = new ArrayList<Integer>(Arrays.asList(6, 7, 2, 1, 4));
		ArrayList<Integer> reqList = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			int rand = (int) (Math.random() * 9 + 1);
			reqList.add(rand);
		}

		//쓰레드 설정
		int num = 100;
		ExecutorService executor = Executors.newFixedThreadPool(num);
		List<Future<List<Integer>>> futures = new ArrayList<>();

		//시간 측정
		long startTime = System.currentTimeMillis();

		//쓰레드별 함수 실행
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
