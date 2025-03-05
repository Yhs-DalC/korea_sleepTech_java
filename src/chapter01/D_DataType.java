package chapter01;

public class D_DataType {
	public static void main(String[] args) {
		/*
		   데이터타입(자료형, Data Type)
		   자바는 '강'타입 언어
		   모든 변수 선언 시 반드시 데이터타입을 명시
		   
		   1. 데이터 타입의 종류
		   1-1. 기본 타입
		   변수 선언시 해당되는 자료형의 크기 만큼 메모리가 할당
		   실질적인 데이터가 저장
		   1-2. 참조 타입
		   객체의 참조(메모리 주소)를 저장하는 변수 타입
		   객체, 배열과 같이 메모리의 Heap 영역에 저장된 데이터를 참조
		 */
		
		// 기본 타입 (자료형 총 8개)
		// byte(1), short(2), long(8), float(4)
		// * int (4), double(8), char(2), boolean(1)
		// 자료형 크기의 단위 : byte
		// 1byte == 8bit
		// 1bit는 메모리 한칸
		
		// 정수형 byte < short < int < long
		// byte : -128 ~ 127 (2^8) 
		// short : -32,768 ~ 32,767
		// * int : 약 -2.1억 ~ 약 2.1억
		// long : 약 -2^63 ~ 약 2^63
		byte byteValue = 127;
		int intValue = 87564321;
		long longValue = 123123123123L; // long타입은 숫자 뒤에 알파벳 l.L을 써서 표기(대문자 권장)
		
		// 문자형 char
		// 2바이트 크기, 단일 문자 저장만 가능
		// 작은 따옴표('')로 표기 
		char grade = 'A';
		// 큰따옴표로 표기하면 오류가 생김
		
		// 실수형 float < double
		// float 4바이트 실수, * double 8바이트 실수
		float dollar1 = 32.123F; // 데이터 값 뒤에 알파벳 f,F 사용(대문자 권장)
		double dollar2 = 32.123;
		
		// 논리형 boolean
		// 데이터 값으로 true, false 만을 가짐
		// 1바이트, 값 지정시 소문자 값 사용을 권장
		// 변수명 지정 시 의문문을 사용
		
		// 참조 자료형
		// 기본 자료형을 기초로 만들어진 자료형
		// 실제 데이터 값이 아니라 데이터가 저장된 주소값을 가지는 자료형
		
		// 문자열 String
		// 문자열(문자 여러 개)을 저장하는 데 사용
		// 큰따옴표("") 사용하여 문자열 작성
		
		String stuName = "양현석";
		int stuAge = 27;
		double stuHeight = 178.01;
		char stuGen = 'M';
		boolean isStu = true;
		
		System.out.println(stuName);
		System.out.println(stuAge);
		System.out.println(stuHeight);
		System.out.println(stuGen);
		System.out.println(isStu);
		
		// 하나의 스코프(중괄호) 내에선 동일한 변수명 사용이 불가능
	}
}
