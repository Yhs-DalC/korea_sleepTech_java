package chapter05;

// 메소드의 종류
// (인스턴스) 메소드, 정적(클래스, static) 메소드

// 클래스 '필드': (인스턴스) 필드, 정적(클래스, static)필드

// 클래스 '메소드'
// 인스턴스 메소드
// 객체(인스턴스)를 생성한 후 호출할 수 있는 메소드
// 정적 메소드
// 객체 생성 없이 호출 가능한 메소드

// 정적 메소드란?
// static 키워드를 사용하여 정의된 메소드, 클래스명으로 직접 호출 가능
// static 반환타입 메소드명 () {}
// 클래스명.메소드명();

// 정적 메소드 특징
// 인스턴스 필드(변수)에 의존하지 않는다
// 클래스 수준에 공유되는 데이터를 다룰 때 적합

// 정적 메소드 사용 권장 사항
// 공통 데이터 사용: 모든 인스턴스에 공유되는 값(정적 필드)을 다룰 때
// 독립적인 사용: 필드값과 관계없이 지역변수만으로 작업 처리 시

class Operator {
	// (인스턴스) 필드 (변수)
	int a, b;
	// (인스턴스) 메소드
	int add() {
		// 필드값을 지정하고자 하는 경우 this 키워드 사용
		// 필드값과 지역변수의 이름이 동일할때
		//int result = this.a - this.b;
		// 인스턴스 변수 활용: 매개변수가 필요하지 않은 경우도 존재
		return a + b;
		
	}
	
	int multiply(int a, int b) {
		int result = this.a - this.b;// 필드값에 접근
		return result;
	}
	// 정적 메소드
	static int subtract(int a, int b) {
		// 필드값과 지역변수의 값이 동일한 경우
		// 해당 지역 (내부의 영역)의 변수명이 우선시된다
		return a - b;
	}
}

public class D_Method {
	public static void main(String[] args) {
		System.out.println("인스턴스 메소드");
		Operator operator = new Operator();
		
		operator.a = 10;
		operator.b = 20;
		
		System.out.println(operator.add());// 30
		
		System.out.println("정적 메소드");
		int result = operator.subtract(10, 20);// 클래스명.메소드명();
		System.out.println(result);// -10
	}
}
