package algorithmStudy.sec01;

/*�ߺ���������
����
�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.

�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.

���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.*/

//�� ��
import java.util.*;
  
public class Q06 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.next();
 	HashMap<Character,Integer> map = new HashMap<>();
    String result="";
    for(int i=0;i<input.length();i++){
    	if(!map.containsKey(input.charAt(i))){
        	map.put(input.charAt(i),i);
          	result+=input.charAt(i);
        }
    }
    System.out.println(result);
  }
}
