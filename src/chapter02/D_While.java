package chapter02;

import java.util.Scanner;

public class D_While {
	public static void main(String[] args) {
		// while문
		// 반복 횟수가 정해져있지 않을 때 사용
		// 조건을 검사하고 해당 조건이 true인 경우 코드 블록을 반복 실행
		// if문의 반복 형태
		
		/*
		 	while (조건) {
		 		조건이 참일 때 실행
		 	}
		 	for문의 초기화식과 증감식이 조건문과 분리된 형태
		 */
		
		// 1부터 5까지 1씩 증가하는 정수를 출력
		int num = 1;//초기화
		
		while (num <= 5) {
			System.out.println(num);
			num++;//증감식
		}
		System.out.println("===============");
		// 0부터 20까지의 정수 중에서 홀수만 출력
		int number = 0;
		while (true) {// 무한 루프
			if (number % 2 == 0) {// 짝수
				number++;// 증가식
				continue;
			}
			// 홀수만 실행
			System.out.println(number);
			number++; // 증가식
			if (number == 20) {
				break;
			}
		}
		System.out.println("===============");
		// do-while문
		// while문과의 차이점 : 코드가 반드시 한번은 실행된다
		
//		do {
//			조건이 참인 경우 실행(조건 검사전 반드시 한번은 실행)
//		} while (조건);
		
		num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= 5);
		
		// while 과 do-while 의 차이점
		// while 조건 검사 시점: 실행 전
		// 최소 실행 횟수 : X
		// do-while 조건 검사 시점: 실행 후
		// 최소 실행 횟수 : 1번
		// 사용자의 입력을 받아야 하는 경우
		// 특정 작업을 한 번 이상 수행해야 하는 경우
		
		//사용자 입력을 받아서 1 ~ 10 사이의 숫자가 입력될 때 까지 반복
		
		Scanner scanner = new Scanner(System.in);
		int numbers = 0;
		do {
			System.out.println("1 ~ 10 사이의 숫자를 입력해주세요.");
			numbers = scanner.nextInt();
		} while (numbers < 0  || numbers > 10); 
		System.out.println("올바른 숫자입니다\n" + numbers);
		
	}
}
