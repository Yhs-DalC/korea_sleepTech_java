package chapter01;

public class G_Operator {
	public static void main(String[] args) {
		// 연산자 Operation
		// 프로그램에서 데이터를 조작하거나 계산
		
		System.out.println("산술 연산자");
		System.out.println(10 + 20);// 덧셈
		System.out.println(10 - 20);// 뺄셈
		System.out.println(10 * 20);// 곱셈
		
		System.out.println(21 / 10);// 나눗셈
		System.out.println(21 % 10);// 나머지
		
		System.out.println("증감 연산자");
		// 변수의 값을 1 증가(++) 시키거나 1 감소(--) 시킴
		int num = 10;
		
		// 전위 증감 연산자, 후위 증감 연산자
		// 전위 증감 연산자 : 값이 먼저 변경되고 그다음 계산에 적용
		System.out.println(++num);// 11
		System.out.println(--num);// 10
		
		// 후위 증감 연산자 : 값이 나중에 변경되고 그다음 계산에 적용
		System.out.println(num++);// 10
		System.out.println(num--);// 11
		
		System.out.println(num);// 10
	
		System.out.println("대입 연산자");
		// 변수에 값을 할당할 때 사용하는 연산자, 기본 연산자 : =
		num = 10;
		System.out.println(num += 3);// 13
		System.out.println(num -= 3);// 10
		System.out.println(num *= 3);// 30
		System.out.println(num /= 3);// 10
		System.out.println(num %= 3);// 1
		
		System.out.println("비교 연산자");
		// 좌항과 우항을 비교한 결과를 불리언값으로 반환
		// <, >, <=, >=, ==, !=
		
		System.out.println(5 > 3);// T
		System.out.println(5 < 3);// F
		System.out.println(5 >= 3);// T
		System.out.println(5 <= 3);// F
		System.out.println(5 == 3);// F
		System.out.println(5 != 3);// T
		
		System.out.println("논리 연산자");
		// 논리 값(boolean)을 연산
		
		// &(앰퍼센트), |(버티컬 바)
		// 논리곱(and) &&: 모든 값이 참일때만 참의 결과를 반환, 하나의 값이라도 거짓이면 거짓을 반환
		System.out.println(true && true);// true
		System.out.println(true && false && true);// false
		
		//논리합(or) ||: 하나의 값이라도 참이면 참을 반환, 모두 거짓일때만 거짓을 반환
		System.out.println(true || false);// true
		System.out.println(false || false);// false
		
		// 부정논리
		// 논리값을 전환함
		// 참과 거짓 앞에 !를 사용해서 작성
		boolean bol1 = true;
		boolean bol2 = false;
		System.out.println(!bol1);
		System.out.println(!bol2);
		
		System.out.println(3 > 2 && 1 == 1);// t
		System.out.println(1 != 1);// f
		System.out.println(3 >= 3 || 10 < 11 && !bol2);// t
		
		// 삼항연산자
		// 조건식 ? 조건식이 참인 경우 : 조건식이 거짓인 경우
		
		int age = 27;
		String drink = age > 19 ? "맥주" : "주스";
		System.out.println(drink + "를 마십니다");
				
		// 정수를 담는 x, y 변수를 선언
		// 각각 10, 2를 할당
		// y값을 활용하여 x가 짝수면 "2의 배수입니다" 출력 홀수면 "2의 배수가 아닙니다" 출력
		
		int x = 10, y = 2;
	
		System.out.println(x % y == 0 ? "2의 배수입니다" : "2의 배수가 아닙니다");
		
		System.out.println("기타 연산자");
		// 문자열 연결 연산자 +
		String result = "a" + "sdf";
		System.out.println(result);
		
		// 연산자의 우선순위
		// 좌측>>우측
		// 그러나, 대입연산자의 경우에는 우항에서 좌항의 대입이 이루어짐
		// ()괄호 연산자의 경우 우선으로 수행함
	}
}
