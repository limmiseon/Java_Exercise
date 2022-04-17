package softwarecoding005;

public class SoftwareCoding005_practice002 {

	public static void main(String[] args) {
		// 구구단 출력(2)
		for (int k34_i = 1; k34_i < 4; k34_i++) {// for문 : k34_i는 1부터 시작하고, k34_i가 4보다 작으면 반복하고, 실행문이 끝나면 kopo34_i를 3씩 증가시킨다.
												 // k34_i는 단수를 의미하고, 마지막 줄의 단수가 3단이기 때문에 범위는 1 ~ 4이다.
			System.out.printf("***************  ***************  ***************\n");
			System.out.printf(" 구구단 %d 단      구구단 %d 단      구구단 %d 단\n", k34_i, (k34_i + 3), (k34_i + 6));
			System.out.printf("***************  ***************  ***************\n");
			for (int k34_j = 1; k34_j < 10; k34_j++) {// 중첩 for문 : k34_j는 1부터 시작하고, k34_i가 10보다 작으면 반복하고, 실행문이 끝나면 kopo34_i를 1씩 증가시킨다.
													  // k34_j는 곱하는 숫자를 의미한다. 단수 * 1 ~ 9 까지 출력해야하므로 범위는 1 ~ 9이다.
				System.out.printf(" %d * %d = %2d       %d * %d = %2d       %d * %d = %2d\n",
								k34_i, k34_j, k34_i *  k34_j, (k34_i + 3), k34_j, (k34_i + 3) * k34_j, (k34_i + 6), k34_j, (k34_i + 6) * k34_j);
			}
		}
	}
}
