package algorithmStudy.sec04;

import java.util.*;

//°­»ç´ä
public class Q04A {
	public int solution(String str1, String str2) {
		int result = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		char[] char2 = str2.toCharArray();

		for (char x : char2)
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		int l = str2.length() - 1;
		for (int i = 0; i < l; i++)
			am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);

		int lt = 0;
		for (int rt = l; rt < str1.length(); rt++) {
			am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(rt), 0) + 1);
			if (am.equals(bm))
				result++;
			am.put(str1.charAt(lt), am.get(str1.charAt(lt)) - 1);
			if (am.get(str1.charAt(lt)) == 0)
				am.remove(str1.charAt(lt));
			lt++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();

		Q04A m = new Q04A();
		System.out.println(m.solution(str1, str2));
	}
}
