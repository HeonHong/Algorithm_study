package algorithmStudy.sec01;

//강사 답
import java.util.Scanner;

public class Q03A {
	public String solution(String str) {
		String result = "";
		int m = Integer.MIN_VALUE, pos;

//		 1번 방식
		 String[] s = str.split(" ");
		 for(String x:s){
		 int len = x.length();
		 if(len>m){
		 m=len;
		 result = x;
		 }
		 }

		
		if (str.length() > m)
			result = str;

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Q03A m = new Q03A();
		System.out.println(m.solution(str));
	}
}