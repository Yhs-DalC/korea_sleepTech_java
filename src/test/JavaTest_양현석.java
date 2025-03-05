package test;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
}

public class JavaTest_양현석 {
	public static void main(String[] args) {
//		1. 서술형
//		- 기본 데이터 타입: 호출시 저장된 데이터를 직접 반환하는 타입
//		char, int , double 등이 있음
//		데이터가 저장됨
//		int num = 1;
//		- 참조 데이터 타입: 호출시 데이터가 저장된 주소를 반환하는 타입
//		String, Array 등이 있음
//		데이터의 주소가 저장됨
//		String text = "txt01";
//		2. 코드 구현 문제
		int num1 = 10;
		double num2 = 3.5;
		double result = num1 + num2;
		System.out.println(result);
//		
//		3. 코드 구현 문제
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		
//		4. 코드 구현 문제
		int[] numbers = {1, 2, 3, 4, 5};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(numbers number : numbers) {
			System.out.println(numbers);
		}
//		5. 코드 구현 문제
		
		
//		Student student1 = new Student("John", 85);
//		Student student2 = new Student("Jane", 92);
//		Student student3 = new Student("Tom", 78);
//		Student student4 = new Student("Emily", 88);
//		Student student5 = new Student("Alex", 95);
		String names[]= { "John", "Jane", "Tom", "Emily", "Alex" };
		int scores[] = {85, 92, 78, 88, 95};
		for(int i = 0; i < 5; i++) {
			Student[i] student = new Student(names[i], scores[i]);
			if(scores[i] >= 90) {
				System.out.println(names[i]);
			}
		}
		
//		6. 단답형
//		Object
		
//		7. 단답형
//		collect
		
//		8. 단답형
//		switch
		
//		9. 다음 중 인터페이스에서 사용할 수 없는 것
//		2. 정적 메서드
		
//		10. 다음중 올바른것은
//		2. 반드시 하나의 추상 메서드 포함
		
//		11. 다음 코드의 출력 결과
//		"Child"
		
//		12. 싱글톤 패턴을 구현할때 가장 일반적으로 사용되는 메서드
//		3.protected static
		
//		13. 추상 클래스
//		아니요
		
//		14. 다운 캐스팅
//		Animal이 Dog의 부모 클래스
		
//		15. 빌더 패턴의 주요 이점
//		2. 객체 생성 시 복잡한 생성자 호출을 피할 수 있다
		
//		16. MVC패턴에서 사용자의 입력을 처리하는 역할
//		1.Model
		
//		17.인터페이스의 모든 메서드는 기본적으로 어떤 접근 제어자?
//		default
		
//		18.추상 클래스와 인터페이스의 주요 차이점 중 맞지 않는 것은?
//		3.인터페이스는 필드를 가질 수 없다.
	}
}
