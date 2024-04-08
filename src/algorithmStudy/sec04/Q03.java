package algorithmStudy.sec04;

/*������� ����
����
������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
�� �������� ���϶�� �߽��ϴ�.
���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
20 12 20 10 23 17 10
�� ���� 4�ϰ��� ������ ����������
ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
���
ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.*/
import java.util.*;

//�� ��
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
