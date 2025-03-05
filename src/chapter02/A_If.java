package chapter02;

import java.util.Scanner;

public class A_If {
	public static void main(String[] args) {
		// 제어문
		// 프로그램의 실행 흐름을 제어하는 문법
		// 조건문(Condition), 반복문(Loop)
		// 조건문: 특정 조건을 만족할 때에만 코드 블록을 반복 실행
		
		// if, else, else if : 조건에 따라 실행할 코드를 결정
		// switch, case, default : 여러 개의 경우에 대해 실행할 코드를 결정
		// continue, break : 실행 흐름을 제어
		
		// 반복문: 특정 조건이 만족될 때까지 코드 블록을 반복 실행
		
		// for, while, do while
		// continue, break
		
		int age = 14;
		/*
		 	if 문 기본 형태 (+ else)
		 	if (조건식){
		 		조건이 참일때 실행할 코드
		 	}else{
		 		조건이 참이 아닐때 실행할 코드
		 	}
		 	-----------------------
		 	else if(조건식){
		 		앞선 조건식이 참이 아니고 이번 조건식이 참일때 실행할 코드
		 	}
		 	if문과 else문 사이에 작성
		 	수의 제한이 없음(if문과 else문은 하나씩만 작성)
		 	-----------------------
		 */
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else if (age > 13) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
		// 실행될 코드 블록에 ({})에 코드가 하나의 구문이라면 중괄호를 생략 가능
		
		// 클린코드
		// 중괄호 내부는 한 칸 들여쓰기
		// 기호와 키워드 사이에는 한 칸 띄워쓰기
		// 콜론의 경우 앞은 붙이고 뒤는 한 칸 띄우기
		
		
		// 조건문 예제
		// 좌표의 사분면 찾기
		// 스캐너를 사용하여 x, y 변수에 데이터를 저장
		// (x, y) 좌표가 제 1, 2, 3, 4 사분면의 어느 위치에 있는지 검사
		// 각 분기에 위치할 경우 functionScope 변수에 몇 사분면인지 할당
		// 조건문 이행 완료 시 
		// "결과: " + functionScope 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x좌표를 입력해주세요");
		int x = scanner.nextInt();
		System.out.println("y좌표를 입력해주세요");
		int y = scanner.nextInt();
		
		String functionScope = null;
		
		if (x > 0 && y > 0) {
			functionScope = "제 1 사분면";
		} else if(x > 0 && y < 0) {
			functionScope = "제 4 사분면";
		} else if (x < 0 && y > 0){
			functionScope = "제 2 사분면";
		} else if(x < 0 && y < 0) {
			functionScope = "제 3 사분면";
		} else if(y == 0){
			functionScope = "y축 위에 있음";
		} else {
			functionScope = "x축 위에 있음";
		}
		System.out.println("결과: " + functionScope);
		
		scanner.close();
	
	}		
}
