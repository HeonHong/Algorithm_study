package algorithmStudy.sec04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*K번째 큰 수
설명
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
입력
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
출력
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.*/
public class Q05 {
    public int solution(int[] arr, int n, int k){
  		int answer=-1;
      	TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//내림차수 없을경우 그냥 new TreeSet<>();
    	for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
            	for(int l=j+1;l<n;l++){
                	Tset.add(arr[i]+arr[j]+arr[l]);
                }//for l
            }//for j 
        }//for i
      
      	int cnt=0;
      	//Tset.remove(143); 143 값 지움
		//Tset.size(); 원소의 개수를 알려줌
      	//Tset.first(); 오름차순이면 최솟값, 내림차순이면 최댓값
      	//Tset.last(); 오름차순이면 최댓값, 내림차순이면 최솟값
      	
      	for(int x:Tset){

          	cnt++;
          	if(cnt==k) return x;
        	//System.out.println(x);//내림차순으로 한 값씩만 나옴
        }
      
    return answer;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
    	arr[i]=in.nextInt();
    }
    
    Q05 m = new Q05();
    System.out.println(m.solution(arr,n,k));
  }
}