package chapter08;

// 추상화(Abstract)
// 추상 클래스 정의
// 미완성 클래스(설계도), 완전하지 않은 클래스
// >> 자체로 인스턴스를 생성할 수 없다
// >> 다른 클래스가 상속받아 완성해야만 사용 가능

// 추상 클래스 특징
// 클래스 자체로 인스턴스 생성이 불가능
// '반드시' 하나 이상의 추상 메소드를 포함
// 확장성 제공을 위해 사용
// >> 자식 클래스가 공통된 기능을 공유 + 고유 기능을 구현하도록 강제
// 다중 상속 불가능. 하나의 extends만 가능

// 메소드 오버라이딩과 추상 메소드
// 추상 메소드: 반드시 자식 클래스에서 오버라이딩 해야됨 (필수)
// 일반 메소드: 필요에 따라 오버라이딩도 가능 (선택)

// 추상 클래스 구현 방법
// 클래스 선언 앞에 'abstract' 키워드 사용

// 추상 메소드
// 메소드의 선언부만 존재, 구현부가 없는 메소드
// >> 자식 클래스에서 해당 메소드를 반드시 구현하도록 강제하는 역할
// >> abstract 키워드 사용 + 구현부 {} 대신 세미클론 ; 을 사용하여 선언을 마침

// 메소드 구성 : 선언부 + 구현부
// [접근제어자] 반환타입 메소드명 (매개변수 ...) {구현부 - 메소드의 기능 동작}

abstract class Human {
	abstract void work();// 추상 메소드 >> 구현부{} 없음
}

class Police extends Human {
	// 추상 메소드 구현
	@Override
	void work() {
		System.out.println("경찰은 치안유지 업무를 담당합니다");
	}
}

class Student extends Human {
	// 추상 메소드
	@Override
	void work() {
		System.out.println("학생은 공부를 합니다");
	}	
}

// 다중 상속 금지
// 라이거 == 타이거 + 라이언
abstract class Lion{
	abstract void mane();// 갈기
}
abstract class Tiger{
	abstract void stripe();// 줄무늬
}

//class Liger extends Lion extends Tiger { >> 다중 상속 불가!
//	void mane() {
//		
//	}
//	void stripe() {
//		
//	}
//}

// 추상 클래스 예시
abstract class Animal {
	
	// 추상 메소드
	abstract void makeSound();
	
	// 일반 메소드
	void eat() {
		System.out.println("동물은 먹이를 먹습니다");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("멍멍");
	}
	
	@Override
	void eat() {
		System.out.println("강아지는 개껌을 먹습니다");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("야옹");
	}
}

public class A_Abstract {
	public static void main(String[] args) {
		// Animal animal = new Animal(); >> 추상 클래스로는 인스턴스화 할 수 없음
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.makeSound();// 멍멍
		dog.eat();// 강아지는 개껌을 먹습니다

		cat.makeSound();// 야옹
		cat.eat();// 동물은 먹이를 먹습니다
		
	}
}
