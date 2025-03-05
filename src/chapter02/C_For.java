package chapter02;

public class C_For {
	public static void main(String[] args) {
		// 반복문(Loop)
		// 특정 조건을 만족 할 때까지 동일한 작업을 반복
		// For, While, Do While
		
		/*
		 	for 문
		 	특정 조건이 만족될 때까지 코드 블럭을 반복 실행
		 	>> 횟수를 지정(횟수가 정해져 있을 때)
		 	
		 	for (초기화; 조건식; 증감식) {
		 		조건이 만족될 때까지 실행할 코드 블록
		 	}
		 	
		 	초기화(Initialization)
		 	반복을 시작할 때 사용할 변수를 초기화하는 부분(반복에 사용할 변수)
		 	
		 	조건(Condition)
		 	반복이 실행될 조건을 정의하는 부분(해당 조건이 참인 동안 반복문이 실행)
		 	
		 	증감(Increment/Decrement)
		 	반복문의 각 실행이 끝나고 난 후 변수의 값을 증감하는 부분(매 반복시 실행)
		 */
		
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		System.out.println("--------------------");
		//for 반복문을 사용하여 1부터 10까지의 숫자 중에서 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------");
		System.out.println("3단");
		int num = 3;
		for (int i = 0; i < 9; i++) {
			int num2 = i + 1;
			System.out.println(num + " * " + num2 + " = " + num * num2);
		}
		// for문의 횟수 지정 방법
		// 초기화를 0으로 설정
		// int i = 0; i < N;
		// N번 반복
		
		// 초기화를 1으로 설정
		// int i = 1; i <= N;
		// N번 반복
		
		// 중첩 for문 (반복문)
		// for문 내에 또 다른 for문 작성
		System.out.println("--------------------");
		for (int i = 0; i < 8; i++) {
			int num1 = i + 2;
			System.out.println("====" + num1 + "단====");
			for (int j = 0; j < 9; j++) { 
				int num2 = j + 1;
				System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
			}
		}
		//for문의 초기화식에서 선언되는 변수는 해당 for문 안에서만 유효함
			
	}
}
