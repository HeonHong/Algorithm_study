package algorithmStudy.sec05;

//강사 답
import java.util.*;

public class Q08A {
	public int solution(int n, int m, int[] arr) {
		int answer = 1;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for (Person x : q) {
				if (x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				if (tmp.id == m)
					return answer;
				else
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Q08A t = new Q08A();
		System.out.println(t.solution(n, m, arr));
	}
}

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

}
/*
 * //class 추가 시 유의할 점 Java 파일 내에서 여러 클래스를 만들 때 주의해야 할 점과 단점은 다음과 같습니다: 1. 하나의
 * public 클래스만 허용: Java 파일에는 public 클래스가 하나만 존재해야 합니다 1. 만약 여러 개의 public 클래스가
 * 존재하면 컴파일 에러가 발생합니다 1. 2. 소스 파일 이름과 public 클래스 이름 일치: 소스 파일의 이름은 public 클래스의
 * 이름과 일치해야 합니다 2. 만약 일치하지 않으면, 이클립스와 같은 IDE에서 자동 실행이 안 될 수 있습니다 2. 3. 가독성 문제:
 * 하나의 파일에 여러 클래스를 작성하면 가독성이 떨어질 수 있습니다 3. 따라서 가능하면 하나의 소스 파일에는 하나의 클래스만 작성하는 것이
 * 바람직합니다 2. 4. 컴파일 문제: 자바스크립트와 달리 자바는 컴파일이 필요하며, 이로 인해 일부 장단점이 존재합니다 4. 이클립스를
 * 사용하면 소스 코드 파일을 저장할 때마다 자동으로 컴파일을 해주지만, 이는 IDE에 따라 다를 수 있습니다 4. 이러한 점들을 고려하여
 * 클래스를 작성하면 좀 더 효율적인 프로그래밍이 가능합니다.
 */