package chapter14;

import java.util.ArrayList;
import java.util.List;

// 람다 표현식()Lambda Expression
// 함수형 인터페이스 구현
// 함수를 하나의 식으로 간결하게 표현
// 익명 클래스를 대체하여 코드의 가독성 형상


// 함수형 인터페이스
//	 단 하나의 추가 메소드만을 가지는 인터페이스
//		@FunctionalInterface 어노테이션
//		디폴트 메소드, 정적 메소드는 포합 가능
@FunctionalInterface
interface MyFunctionalInterface{
	void doSimething();
	//void anotherDoSomething();- 함수형인터페이스는 단 하나의 추상 메소드만을 가짐
}
// 람다식 기본 형태
/*
 * 메소드의 기본 형태
 * [접근제어자] 반환타입 메소드명(매개변수){ 구현부 };
 * 
 * 람다식
 * (params) -> { 구현부(실행문) };
 * 
 * 1.매개변수(params)
 * 함수형 인터페이스에서 메소드와 동일한 매개변수 사용
 * 
 * 2.화살표
 * 연산자(->)
 * 매개변수와 구현부(실행문, 바디)를 구분
 * 
 * 3.바디
 * 메소드의 구현부({}, 코드블록)
 */

// 람다식 사용 예제
//1. 기본 표현: 여러 개의 매개변수, 하나의 실행문(중괄호 생략 가능)
@FunctionalInterface
interface Calculator{
	int add(int a, int b);
}
//2. 매개변수가 없는 경우
@FunctionalInterface
interface NoParams{
	void sayHello();
}
//3. 매개변수가 한 개인 경우(소괄호 생략 가능)
@FunctionalInterface
interface OneParams{
	void print(String Message);
}
//4. 실행문이 여러 줄인 경우
@FunctionalInterface
interface Operation{
	void operate(int a, int b);
}
//5. 반환값이 있는 경우
@FunctionalInterface
interface StringLength{
	int getLength(String str);
}



public class D_Lambda {
	public static void main(String[] args) {
		//1. 기본 표현-익명 클래스
		Calculator calculator1 = new Calculator() {
			
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println("익명 클래스 결과:"+calculator1.add(3, 5));
		
		// 1.기본 표현- 람다식
		// 람다식의 경우 구현부가 한 줄 일때 중괄호 생략 가능
		// >> 리턴 키워드까지 생략, 값은 곧바로 반환
		Calculator calculator2 = (a, b) -> a + b;
		
		System.out.println("람다식 결과: " + calculator2.add(5, 7));
		
		Calculator calculator3 = (a, b) -> {
			// 여러 줄의 구현이 필요한 경우 {} 생략 불가
			// >> 반환값이 있는 경우 반드시 리턴 키워드 사용
			int result = a + b;
			return result;
		};
		System.out.println("람다식 결과2: " + calculator3.add(7, 9));	
		
		// 2. 매개변수가 없는 경우
		// 괄호 생략 불가
		NoParams noParams = () -> System.out.println("매개변수가 없습니다");
		noParams.sayHello();
		
		// 3. 매개변수가 한 개인 방식
		// 소괄호 생략 가능
		OneParams oneParams = message -> System.out.println("출력: "+ message);
		oneParams.print("안녕");
		
		// 4. 출력문이 여러 줄인 방식
		Operation operation = (a, b) -> {
			System.out.println("합: " + (a + b));
			System.out.println("차: " + (a - b));
		};// 인터페이스로 클래스 선언과 동시에 인스턴스화
		
		operation.operate(10, 20);
		
		// 5. 반환값이 있는 경우
		// 실행문이 한줄: 생략가능
		// 실행문이 여러줄: return 생략불가
		StringLength stringLength = str -> str.length();
		System.out.println("문자열의 길이: " + stringLength.getLength("Lambda"));
		
		// 여러 줄의 코드가 실행문에 작성될 경우
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println(numbers);
		
		for (Integer num: numbers) {
			System.out.println(num);
		}
		
		numbers.forEach(num -> System.out.println(num));
	}
}
