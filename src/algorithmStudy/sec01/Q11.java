package algorithmStudy.sec01;

/*���ڿ� ����
����
���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.

�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.

���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.*/

//�� ��
import java.util.Scanner;
  
public class Q11 {
	public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();
    String result = "";

    int cnt=1;
    //ù ���ڸ� ������ ���̱�
    //cnt==0�̸� ������ ���̱�
   
    //�ձ��ڿ� ���� ��� cnt==0;
    //cnt++;
    //�޶����� ���� ++cnt(ù���� ����)�� �� result�� ���̱�
    //cnt=0���� ����
    
    //�ձ��ڿ� �ٸ� ��� cnt==0;
    //result�� input1.charAt(i);
   
    
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
