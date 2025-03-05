package chapter02;

import java.util.Scanner;

public class E_Practice {
	public static void main(String[] args) {
		/*
		1. 점수에 따른 학점 출력 (if, else if, else 사용)

        사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요.
        0 미만 또는 100 초과인 경우: 유효하지 않은 점수입니다.
        90 이상: A
        80 이상: B
        70 이상: C
        60 이상: D
        그 외: F
	
		2. 삼각형 모양의 별(*) 출력 (중첩 for 사용)
        (1)
        *
        **
        ***
        ****
        *****
        
        >> 행이 5번 반복 (줄 수 1 ~ 5까지 반복)
        >> 각 행 마다 * 별의 개수가 1씩 증가 (1에서 5로 증가)
        	: 각 줄의 별 개수는 각 줄의 수 보다 "이하"의 값
        
	*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("유효하지 않은 점수입니다.");
		}else if (score >= 90) {
			System.out.println("A학점입니다.");
		}else if (score >= 80) {
			System.out.println("B학점입니다.");
		}else if (score >= 70) {
			System.out.println("C학점입니다.");
		}else if (score >= 60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		scanner.close();
		
		System.out.println("=====================");
		
		for (int i = 1; i <= 5; i++) {
//			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("=====================");
	
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
		
			System.out.println();
			
		}
		
	}
}