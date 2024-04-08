package algorithmStudy.sec04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*K��° ū ��
����
������ 1���� 100������ �ڿ����� ���� N���� ī�带 ������ �ֽ��ϴ�. ���� ������ ī�尡 ������ ���� �� �ֽ��ϴ�.
������ �� �� 3���� �̾� �� ī�忡 ���� ���� ���� ���� ����Ϸ��� �մϴ�. 3���� ���� �� �ִ� ��� ��츦 ����մϴ�.
����� �� �� K��°�� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� ū ������ ������� ���� 25 25 23 23 22 20 19......�̰� K���� 3�̶�� K��° ū ���� 22�Դϴ�.
�Է�
ù �ٿ� �ڿ��� N(3<=N<=100)�� K(1<=K<=50) �Էµǰ�, �� ���� �ٿ� N���� ī�尪�� �Էµȴ�.
���
ù �ٿ� K��° ���� ����մϴ�. K��° ���� �������� ������ -1�� ����մϴ�.*/
public class Q05 {
    public int solution(int[] arr, int n, int k){
  		int answer=-1;
      	TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//�������� ������� �׳� new TreeSet<>();
    	for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
            	for(int l=j+1;l<n;l++){
                	Tset.add(arr[i]+arr[j]+arr[l]);
                }//for l
            }//for j 
        }//for i
      
      	int cnt=0;
      	//Tset.remove(143); 143 �� ����
		//Tset.size(); ������ ������ �˷���
      	//Tset.first(); ���������̸� �ּڰ�, ���������̸� �ִ�
      	//Tset.last(); ���������̸� �ִ�, ���������̸� �ּڰ�
      	
      	for(int x:Tset){

          	cnt++;
          	if(cnt==k) return x;
        	//System.out.println(x);//������������ �� ������ ����
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