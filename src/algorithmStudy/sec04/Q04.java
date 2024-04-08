package algorithmStudy.sec04;

/*��� �Ƴ��׷� ã�� 
����
S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
�Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
�Է�
ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
���
S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.*/
//�� ��
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
