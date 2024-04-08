package algorithmStudy.sec01;

/*문자열 압축
설명
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 압축된 문자열을 출력한다.*/

//내 답
import java.util.Scanner;
  
public class Q11 {
	public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();
    String result = "";

    int cnt=1;
    //첫 글자면 무조건 붙이기
    //cnt==0이면 무조건 붙이기
   
    //앞글자와 같을 경우 cnt==0;
    //cnt++;
    //달라지는 순간 ++cnt(첫글자 포함)한 값 result에 붙이기
    //cnt=0으로 변경
    
    //앞글자와 다를 경우 cnt==0;
    //result에 input1.charAt(i);
   
    
    for(int i = 0;i<input1.length();i++){
   
      if(input1.charAt(i)==input1.charAt(i+1)){
        if(cnt==1)result+=input1.charAt(i);
      	if((i+2)==input1.length()){
          	++cnt;
          	result+=cnt;
        	break;
        }
        cnt++;
        
      }else if(input1.charAt(i)!=input1.charAt(i+1)){
        if(cnt==1) result+=input1.charAt(i);
        if(cnt!=1) result+=cnt;
        if((i+2)==input1.length()){
          	result+=input1.charAt(i+1);
        	break;
        }
        cnt=1;
      }
      	
    }
    System.out.print(result);
  }
}
