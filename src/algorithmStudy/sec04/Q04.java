package algorithmStudy.sec04;

/*모든 아나그램 찾기 
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.*/
//내 답
import java.util.*;
  
public class Q04 {
    public int solution(String str1,String str2){
  	int result =0, lt=0;
    HashMap<Character,Integer> curr = new HashMap<>();
    HashMap<Character,Integer> comp = new HashMap<>();
    char[] char1 = str1.toCharArray();
    char[] char2 = str2.toCharArray();
    for(int i=0;i<str2.length();i++){
   		if(comp.containsKey(char2[i])){
          	int temp=comp.get(char2[i])+1;
        	comp.put(char2[i],temp);
        }else{
        	comp.put(char2[i],1);
        }
    }//for i
      
   
    for(int i=0;i<str2.length();i++){
    	if(curr.containsKey(char1[i])){
          	int temp=curr.get(char1[i])+1;
        	curr.put(char1[i],temp);
        }else{
        	curr.put(char1[i],1);
        }
    }
   
      boolean isTrue=true;
   
    for(int i=str2.length();i<=str1.length();i++){
         for(char c:comp.keySet()){
        	if(curr.get(c)!=comp.get(c)){
            	isTrue=false;
              	break;
            }
    	}
      	if(isTrue) result++;
    	isTrue=true;
      	if(i==str1.length()) break;
      
      	if(curr.containsKey(char1[i-str2.length()])){
          	int temp=curr.get(char1[i-str2.length()])-1;
        	curr.put(char1[i-str2.length()],temp);
        }else{
        	curr.remove(char1[i-str2.length()]);
        }
      
      	if(curr.containsKey(char1[i])){
          	int temp=curr.get(char1[i])+1;
        	curr.put(char1[i],temp);
        }else{
        	curr.put(char1[i],1);
        }
    	 
    	
    }
    
    return result;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str1 = in.next();
    String str2 = in.next();
    
    Q04 m = new Q04();
    System.out.println(m.solution(str1,str2));
  }
}
