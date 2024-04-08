package algorithmStudy.sec06;

//°­»ç ´ä
import java.util.Scanner;
  
public class Q03A {
  public int[] solution(int[] arr){
    	int cnt=0;

   	for(int i=1;i<arr.length;i++){
      	int tmp=arr[i],j;
    	for(j=i-1;j>=0;j--){
        	if(arr[j]>tmp) arr[j+1]=arr[j];
            else break;
        }//for j
      	
      	arr[j+1]=tmp;
      
    }//for i
  	return arr;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
    	arr[i] = in.nextInt();
    }
    Q03A m = new Q03A();
    for(int x : m.solution(arr))  System.out.print(x+" ");
  }
}