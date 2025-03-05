package chapter05;

// 메소드 오버로딩
// overloading: 중복 정의
// 하나의 클래스 내에서 동일한 이름의 메소드를 여러 개 정의하는 것

// 변수는 같은 영역 내에동일한 이름의 재선언이 불가능

// 오버로딩 성립 조건
// 메소드 이름은 동일
// 단, 매개변수의 개수 또는 타입은 달라야 한다
// 반환타입은 오버로딩 성립에 영향이 없음

// 오버로딩의 장점
// 사용자가 메소드의 매개변수 순서를 외우지 않아도 사용 가능
// 작업의 본질이 동일한 메소드를 하나의 이름으로 그룹화 가능: 코드의 재사용성과 가독성을 향상함
// 컴파일 시 타입 체크 강화: 올바른 매개변수를 가진 메소드를 자동 선택

// 오버로딩의 단점
// 중복적으로 의미없이 생성하는 경우, 실질적으로 필요한 구현 메소드 찾기가 어려워짐(복잡성)

class Calc {
	int add (int a, int b) { return a + b; }
	// long add (int a, int b) {return a + b;}
	// 실제 반환되는 값의 차이가 아닌, 입력받는 매개변수의 차이가 필요
	// 반드시 매개변수의 개수 또는 타입의 구성이 달라야 한다
	
	// 매개변수 타입 차이
	int add (short a, short b) { return a + b; }// 개수 동일, 구성 상이
	
	double add (double x, double y) { return x + y; }
	double add (int x, double y) { return x + y; }
	double add (double x, int y) { return x + y; }
	
	// 매개변수 개수 차이
	int add (int a, int b, int c) { return a + b + c; }
}

public class F_Overloading {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(10, 20, 30));
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10.5, 20.3));
		System.out.println(calc.add(10.3, 30));
		System.out.println(calc.add(10, 29.4));
	}
}
