package chapter13;

// 제네릭(Generic) - 일반적인
// 데이터의 타입을 '일반화'한다
// 클래스나 메소드의 데이터 타입을 미리 지정하지 않고
// 구체적인 타입을 사용 시점에 지정할 수 있도록 하는 기능
// 특정 타입에 의존하지 않고 다양한 타입을 지원하는 설계 가능

// 제네릭 주요 장점
// 타입 안정성
// 코드 제사용성
// 가독성

// 제네릭 사용 방법
// 1)제네릭 클래스

/*
 	#타입 변수: <T> (Type: 타입), 이후에는 다음 알파벳값 U, V 등등 사용
 	해당 기능 사용시 작성되는 실질적인 타입이 타입 변수에 전달되어 사용
 	
	class 클래스명<제네릭타입>{
		제네릭 타입을 사용하여 필드, 생성자, 메소드 정의
	}
 */

class Pair<K, V>{//Key, Value
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() { return key; }
	public V getValue() { return value; }

	// 2) 제네릭 메소드
	// [접근제한자]<제네릭 타입>반환타입 메소드명(매개변수...){구현부}
	// 메소드 호출 시 전달된 타입에 따라 메소드 내부의 타입변수 값이 결정됨
	static <T> void print(T value) {
		System.out.println(value);
	}
}




public class A_Generic {
	public static void main(String[] args) {
		// 제네릭 클래스 사용 방법
		// 클래스명<제네릭 타입> 인스턴스명 = new 클래스명<>();
		
		// 제네릭 타입 명시는 필수가 아님
		// 제네릭 타입의 구조에 값이 들어올 경우 해당 값으로 타입을 자동으로 유추하고 할당됨
		
		Pair<Integer, String> pair1 = new Pair<>(123, "안녕하세요");// 인자값으로 타입을 자동 유추
		Pair<Integer, String> pair2 = new Pair<Integer, String>(123, "안녕하세요");
		// 좌항의 클래스타입에는 타입 명시
		
		// 제네릭 타입의 경우 클래스 형식의 참조 자료형을 사용
		// Wrapper 자료형
		// int >> Integer
		// char >> Character
		
		System.out.println(pair1.getValue());// 안녕하세요
		System.out.println(pair1.getKey());// 123
		
		Pair<String, Integer> pair3 = new Pair<>("문자열", 321);
		
		System.out.println(pair3.getValue());// 321
		System.out.println(pair3.getKey());// 문자열
		
		// 제네릭 메소드 사용 방법
		// <제네릭 타입>메소드명(인자값);
		Pair.print("안녕");// 안녕
		Pair.<Integer>print(500);// 500
		
		
		
		
		
		
		
		
		
	}
}
