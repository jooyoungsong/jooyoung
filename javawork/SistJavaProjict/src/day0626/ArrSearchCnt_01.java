package day0626;

import java.util.Scanner;

import day0622.StartWith_03;

public class ArrSearchCnt_01 {

	public static void main(String[] args) {
		/*
		 * Q. 반복문 안에서 실행... 성을 입력시 그 성씨를 가진 사람과 총 인원수를 출력해라.. "종료"라고 하면 프로그램 종료
		 */

		String[] names = { "김선호", "나나", "이효리", "엄정화", "김완선", "보아", "유재석", "하하", "김연진", "이진" };

		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String search; // 입력할 성
		Boolean flag;
		
		
		while (true) {
			System.out.println("성을 입력하시오");
			search = sc.nextLine();

			flag = false;

			if (search.equals("종료"))
				break;

			for (int i = 0; i < names.length; i++) {
				if (names[i].startsWith(search)) {
					flag = true;
					cnt++;
				}

			}

			if (flag) {
				System.out.println(search + "의 성을 가진 사람은 총 " + cnt + "명입니다");
				cnt = 0;
			}

			else {
				System.out.println(search + "의 검색결과는 없습니다");
			}

		}

	}

}
