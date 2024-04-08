package algorithmStudy.sec03;

/*������� ���ϱ� 20��(Two Pointers Algorithm)
����
A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
���
�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.*/

//�� ��
import java.util.*;
  
public class Q02 {
  
  public int[] solution(int n1,HashMap<Integer,Integer> map, int n2, int[] arr2){
   	 int[] result = n1>n2?new int[n1]:new int[n2];
    int cnt=0;
    for(int i =0;i<n2;i++){
     if(map.containsKey(arr2[i])){
     	result[cnt]= map.get(arr2[i]);//getKey �ƴ�
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
    HashMap<Integer,Integer> map = new HashMap<>(); // Ÿ�� �� ����
    
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