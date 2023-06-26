package day0626;

import java.util.Scanner;

public class BuyLottos_04 {

	public static void main(String[] args) {
		// 로또 몇장 구입할 건지 입력하여 여러개 출력

		Scanner sc = new Scanner(System.in);
		int guip; // 몇장, 얼마
		int[] lotto = new int[6];

		System.out.println("로또 얼마를 구입할지 입력하세요");
		guip = sc.nextInt();

		// 예외조항
		if (guip < 1000) {
			System.out.println("***구입횟수가 부족합니다***");
			return; // 메인함수 빠져나간다.
		}

		for (int n = 0; n < guip/1000; n++) {
			System.out.printf("%d회: ",n+1);
			for (int i = 0; i < lotto.length; i++) {
				// 1~45까지의 랜덤수 발생
				lotto[i] = (int) (Math.random() * 45) + 1;

				// 중복처리
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--; // 같은 번지에 다시 값을 구하기 위함_로또 index(배열) i와 j가 같다면 i는 빼줘야 중복이 제거됨
						break; // 중복제거 후 i++로 가야하기 때문에 break 써준다. 그럼 반복문 for문 빠져나간다.
					}
				}
			}

			// Arrays.sort(lotto);
			// 오름차순정렬(기준데이터:처음~끝에서2번째/비교데이터:처음의 다음값부터 끝까지)

			for (int i = 0; i < lotto.length - 1; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}

			// 출력
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf("%5d", lotto[i]);
			}
			System.out.println();

		}

	}

}
