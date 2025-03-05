package chapter05;


/*
 	함수(Function)와 메소드(Method)
 	자바에서는 함수의 개념이 존재하지 않음
 	모든 함수 체계는 "클래스 내부"에 존재>>"메소드"로 불림
 	
 	함수 : 특정 작업을 수행하는 코드 블록
 	독립적으로 존재, 클래스 소속 X
 	직접 호출: 함수명();
 	>> Python, JavaScript 등에서 사용
 	
 	메소드 : 객체의 동작을 정의한 코드 블록
 	클래스 내부에 포함, 객체의 행위와 연결
 	객체 생성후, .연산자를 통해 호출
 	>> Java, C# 등에서 사용
 	
 	===메소드===
 	특정 작업을 하나로 묶은 것
 	어떤 값들을 입력하면 해당 값들로 작업을 수행하여 결과를 반환
 	
 	메소드 구조
 	선언부, 구현부
 	
 	반환타입 메소드명() {} 
 	선언부: 반환타입 메소드명 (매개변수 나열)
 	구현부: {메소드 호출 시 수행될 코드}
 	
 	메소드를 "정의한다": 선언부와 구현부를 작성한다
 	
 	매개변수(parameter) 선언
 	메소드가 작업을 수행하는데 필요한 값들을 제공받음
 	>> 필요한 개수만큼 선언, 데이터타입 생략 불가
 	
 	구현부>> 반환타입이 void가 아닌경우 반드시 "return 반환타입데이터"를 포함해야 한다
 	반환값은 명시된 반환타입과 일치하거나 자동 형 변환이 가능한 데이터여야 한다
 */

class Example {
	int x, y;// 인스턴스 필드
	
	int add (int x, int y) {// 파라미터(매개변수)-지역변수
		int result = x + y;//지역변수
		return result;
	}
	
	double multiply() {
		int result = x * y;
		return result;
	}
	
	// 반환값 X, 매개변수 X
	void print99dan(){// 메소드명은 변수명의 명명규칙과 동일
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}

public class B_Method {
	public static void main(String[] args) {
		Example example = new Example();
		example.print99dan();
		// 함수의 파라미터에 데이터 전달
		// 함수 호출 시 () 영역 내에서 parameter(매개변수)에 전달되는 값을 argument라고 부름
		
		// 데이터타입 변수 = 실제데이터값;
		int num = 5;
		
		// 매개변수(parameter)와 인자(argument)
		
		// 매개변수: 메소드 정의 시 소괄호 안에 선언되는 '변수'
		// 메소드 호출 시 값을 전달받기 위한 입력변수로 사용
		// 호출 시 전달받은 값은 구현부 내에서 사용
		
		// 인자(인수)
		// 메소드를 호출할 때 소괄호 안에 전달되는 '값'
		// 호출된 메소드의 매개변수에 실제 데이터를 전달
		// 메소드 호출부에서 전달, 매개변수에 저장
		
		// example.add(1);
		// example.add(1, 2, 3);>>>인자값과 매개변수의 수는 같아야 한다
		// example.add("1", "2");>>>인자값과 매개변수의 타입은 같거나 자동 형 변환이 가능해야 한다
		example.add('1', '2'); // 자동 형 변환 가능 char[2]->int[4]
		
		System.out.println(example.add(10, 20));// 30
	}
}
