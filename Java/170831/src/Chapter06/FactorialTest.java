package Chapter06;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);

		System.out.println(result);
	}

	static int factorial(int n) {
		int result = 0;

		if (n == 1)
			result = 1;
		else
			result = n * factorial(n - 1); // 다시 메서드 자신을 호출한다.
		// 재귀함수 : 클론이 생긴다 (메모리 많이 잡아먹음. 디버깅 어렵다.)

		return result;
	}
}
