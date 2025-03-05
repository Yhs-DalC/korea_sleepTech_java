package chapter14;

/*
 * 배열과 리스트
 * 공통점: 순서 O, 인덱스 번호가 존재(0부터 시작)
 * 
 * 1. Array(배열)
 * 정의와 동시에 길이를 지정, 길이를 바꿀 수 없음(정적 배열)
 * 여러 데이터를 하나의 object로 관리하기 위한 자료 구조
 * 연속된 메모리 공간에 저장
 * 인덱스 번호가 데이터의 식별자 역할
 * 
 * 2. List(리스트)
 * 배열의 크기가 정해져 있지 않음(동적 배열)
 * ArrayList, LinkedList등이 존재
 * 불연속적 메모리 공간에 저장
 * 인덱스 번호가 데이터의 저장 위치 확인 역할
 */

//## List<>는 불변 리스트, 가변 리스트 모두 할당 가능


public class Z_Array_List {
	public static void main(String[] args) {
		// new ArrayList<>()
		// Arrays.asList()
		// List.of()
		
		// 구현 방식
		// 생성자 방식
		// Arrays 클래스의 asList 메소드 >> 배열을 List로
		// List 인터페이스의 of 메소드 >> List의! 요소로
		
		// 원소 추가, 삭제(add, remove)
		// 길이값 변경
		// O
		// X
		// X
		
		// 원소 수정(set)
		// O
		// O
		// X
		
		//## Arrays.asList() 메소드
		// 가짜 ArrayList
		// Arrays 클래스 내부에 구현된 별개의  ArrayList(컬렉션 프레임워크 X)
		
		//## List.of() 메소드
		// 읽기 전용(불변) 리스트를 생성하는 데 사용
		// 수정 불가(추가, 수정, 변경)
		// null 값을 포함할 수 없음
		
		
	}
}
