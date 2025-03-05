package chapter07;

// final 키워드
// 변수, 메소드, 클래스에서 사용 가능
// 변수: 값을 변경할 수 없는 상수 선언
// 메소드: 자식 클래스에서 재정의(오버라이드)할 수 없는 메소드 선언
// >> 해당 메소드는 재정의 될 수 없음
// 클래스: 상속될 수 없는 클래스 선언

class MyFinalClass {
	// final 변수
	// 상수를 지정하는 키워드
	// 선언과 동시에 '초기화', 재할당 불가능
	// UPPER_SNAKE_CASE(전체 키워드를 대문자로 작성)
	final int FINAL_VARIABLE = 30;
	
	// final 메소드
	// 자식 클래스에서 오버라이드(재정의)할 수 없는 메소드를 의미
	// [접근제어자] final 반환타입 메소드명() {}
	public final void myMethod() {
		System.out.println("재정의 할 수 없는 메소드");
	}
}

class ChildClass extends MyFinalClass{
	// 상속받은 final 클래스는 자식 클래스 내에서 재정의 X
	// 생략된 형태로만 사용 가능
//	@Override
//	public void myMethod() {
//		
//	}
	// 생성자
	ChildClass(){
		super.myMethod();
	}
}

// final 클래스
// final class 클래스명 {}
// 더 이상 상속될 수 없는 클래스를 의미
// final 클래스를 부모 클래스로 사용할 수 없다

final class Example1{}
//class Exampe2 extends Example1{}

class StudentClass {
	private String name;// 보호 O, 변경 O
	// final 필드의 데이터 주입
	// >> final 키워드는 선언과 동시에 초기화가 필요하다
	// 필드 주입 방식: private final int residentNumber = 123;
	// 생성자 주입 방식: 아래방식
	private final int residentNumber;// 보호 O, 변경 X
	private String gender;// 보호 O, 변경 X
	// 주민등록번호에 대한 불변성이 필요
	// >> final 필드 사용 또는 setter를 제거하고 생성자로만 값을 결정하는 방식
	
	public StudentClass(int residentNumber, String gender){
		this.residentNumber = residentNumber;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class C_Final {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();// 재정의 할 수 없는 메소드
		childClass.myMethod();// 재정의 할 수 없는 메소드
		
		// final 장단점
		// 장점: 불변성(안정성 보장)
		// 단점: 유연성 감소(상속: X, 오버라이딩: X >> 그 자체로만 사용 가능)

	}
}
