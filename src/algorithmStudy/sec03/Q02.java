package algorithmStudy.sec03;

/*공통원소 구하기 20분(Two Pointers Algorithm)
설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.
출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.*/

//내 답
import java.util.*;
  
public class Q02 {
  
  public int[] solution(int n1,HashMap<Integer,Integer> map, int n2, int[] arr2){
   	 int[] result = n1>n2?new int[n1]:new int[n2];
    int cnt=0;
    for(int i =0;i<n2;i++){
     if(map.containsKey(arr2[i])){
     	result[cnt]= map.get(arr2[i]);//getKey 아님
       	cnt++;
     } 
    }
    
    for(int i = 0;i<cnt;i++){
    	for(int k=i+1;k<cnt;k++){
        	if(result[i]>result[k]){
            	int temp = result[i];
              	result[i] = result[k];
              	result[k] = temp;
            }
        }//for k
    }//for i
    return result;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n1 = in.nextInt();
    HashMap<Integer,Integer> map = new HashMap<>(); // 타입 잘 쓰기
    
    for(int i=0;i<n1;i++){
    	int temp = in.nextInt();
      	map.put(temp,temp);
    }//for i
    
    int n2 = in.nextInt();
    int[] arr2 = new int[n2];
     for(int i=0;i<n2;i++){
    	arr2[i] = in.nextInt();
      
    }//for i
    Q02 m = new Q02();
    for(int r:m.solution(n1, map, n2, arr2)){
    	if(r!=0)System.out.print(r+" ");
      	else break;
    }
  }
}