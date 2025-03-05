package chapter05;

// 자바 객체 지향 프로그래밍
// 클래스 : 객체를 생성하기 위한 템플릿
// 필드, 메소드, 생성자

// 클래스의 필드: 클래스의 특성이 담긴 속성

//메소드
/*
 	ReturnType methodName(Parameter List){
 		메소드의 기능, 동작 정의
 	}
 	
 	ReturnType(반환 유형): 메소드 동작 후 반환하는 데이터 유형 지정
 	반환 데이터가 없는 경우 void 지정
 	
 	methodName(메소드명): lowerCamelCase 사용, 동사 사용을 권장
 	#변수명: 명사 사용을 권장
 	
 	Parameter List(매개변수 목록): 메소드에 전달되는 입력 값들의 목록
 	0개 이상 지정(지정하지 않을 수도 있음)
 	각 매개변수는 자료형과 함께 선언(일반 변수 선언처럼 동일한 데이터 타입의 생략이 불가능) int a, b; (X)
 */

class Calculator {
	int a, b;
	
	int add(int a, int b) {
		int sum = a + b;
		return sum; // return : 메소드의 반환을 담당, 반환타입과 일치하는 데이터를 동반함
	}
	void voidMethod() {
		return;
	}
}

public class A_Method {
	public static void main(String[] args) {
		// 메소드 사용
		// 객체명.메소드();
		Calculator calc = new Calculator();// 객체 생성
		
		// 메소드의 반환 값이 있는 경우
		// 해당 값을 변수에 할당받아 활용 가능
		System.out.println(calc.add(10, 5));// 15
		
		int result = calc.add(3, 5);
		System.out.println(result);// 8
	}
}
