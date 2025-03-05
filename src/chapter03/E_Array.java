package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class E_Array {
	public static void main(String[] args) {
		// 자바 배열(정적) : 한번 생성되면 크기 변경이 안됨
		// 크기 변경이 필요한 경우, 배열을 새로 생성하여 요소값을 복사
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers));// [0, 0, 0, 0, 0]
		
		// 동적 배열(ArrayList)
		// ArrayList: 자바의 동적 배열 구현체
		// 크기 제한 없이 동적으로 요소 추가 / 삭제 기능
		// Java Collection Framework의 일부.  java.util.Arrays에서 제공
		// ArrayList의 장점
		// 동적 크기, 유연성, 다양한 메소드 제공
		// ArrayList 주의점
		
		// int[] 배열명 = new int[크기];
		// 정적 배열의 경우 기본값이 '기본 데이터'로 지정
		// boolean[] >> false
		// char[] >> ' '
		// int[] >> 0
		// double[] >> 0.0
		
		// ArratList의 경우 기본 데이터 타입 사용 X
		// 참조 데이터 타입만 가능
		// String : 문자열
		// int : Integer
		// char : Character
		// 이외의 기본 데이터타입은 첫 글자를 대문자로 작성
		
		// 참조 데이터 타입은 기본값이 모두 null
		// null: 아무 객체도 참조하지 않음을 나타내는 값 (기본 데이터 타입에선 사용 불가능)
		// Collection Framework의 모든 클래스 내부에서는 객체 구조만을 다룸
		// 기본 타입 사용 X
		
		Integer a = null;
		// int b = null;
		
		// ArrayList 생성
		// ArrayList<데이터타입> 변수명 = new ArrayList<>(초기용량);
		
//		int[] numberArray = new int[]; 
		// 정적 배열은 크기값 미지정 시 오류
		// 크기를 명시적으로 전달하지 않을 경우 실제 요소값이라도 전달
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		// 초기용량 미지정시 기본값 10
		// > 해당 용량은 배열 사용시 담겨있는 요소의 크기만큼만 측정됨
		
		System.out.println(arrayList);// []
		
		// ArrayList 데이터 추가
		// 배열의 마지막에 값을 추가
		// 배열명.add(추가할 데이터)
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		System.out.println(arrayList);// [10, 20, 30]
		
		// ArrayList 데이터 변경
		// 배열명.set(인덱스번호, 변경할 데이터);
		arrayList.set(1, 50);
		System.out.println(arrayList);// [10, 50, 30]
		
		// ArrayList 데이터 삭제
		// 배열명.remove(인덱스번호)
		arrayList.remove(2);
		System.out.println(arrayList);// [10, 50]
		
		// ArrayList 크기 확인
		// 배열명.size();
		System.out.println(arrayList.size());// 2
		
		// ArrayList 원하는 위치에 데이터 삽입
		// 배열명.add(인덱스번호, 데이터값)
		arrayList.add(1, 123);
		System.out.println(arrayList);// [10, 123, 50]

		
		// 특정 요소 접근
		// 배열명.get(인덱스번호)
		System.out.println(arrayList.get(1));// 123
	}
}
