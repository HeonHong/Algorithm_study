package algorithmStudy.sec04;

/*매출액의 종류
설명
현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
각 구간별로 구하라고 했습니다.
만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10
각 연속 4일간의 구간의 매출종류는
첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
매출액의 종류를 출력하는 프로그램을 작성하세요.
입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
출력
첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.*/
import java.util.*;

//내 답
public class Q03 {
  
  public ArrayList<Integer> solution(int n, int k, int[] arr){
  	HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> result = new ArrayList<>();
   	int lt=0, cnt=0;
    for(int rt=0;rt<k;rt++){
    	if(map.containsKey(arr[rt])){
          int temp = map.get(arr[rt])+1;
          map.put(arr[rt], temp);
        }else{
        	map.put(arr[rt],1);
        }
    }
    result.add(map.keySet().size());
    
    for(int rt=k;rt<n;rt++){
  
     	if(map.get(arr[lt])>1){
          int temp = map.get(arr[lt])-1;
          map.put(arr[lt], temp);
        }else{
          map.remove(arr[lt]);
        }
        lt++;	
      	if(map.containsKey(arr[rt])){
          int temp = map.get(arr[rt])+1;
          map.put(arr[rt], temp);
        }else{
        	map.put(arr[rt],1);
        }
    	result.add(map.keySet().size());
    }
    
    return result;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int  n = in.nextInt();
    int k = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
    	arr[i]=in.nextInt();
    }
    Q03 m = new Q03();
    for(int r:m.solution(n,k,arr)){
        System.out.print(r + " ");

    }
  }
}
