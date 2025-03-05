package chapter04;

// 클래스 Book
class Book {
	// 클래스 내부의 데이터(속성, 필드)
	String title; // 제목
	String publisher; // 출판사
	int pageNumber; // 페이지 수
	
	// 클래스 내부의 동작 (행동, 메소드)
	void displayInfo() {
		System.out.println(title + " " + publisher);
		return;
//		System.out.println(); // 해당 코드에 접근할 수 없음
	}
	
	// 생성자 메소드
	// new 연산자 사용 시 호출 될 메소드
	// 필드값 초기화에 주로 사용
	// 생략시 속성에 기본값이 할당된다
	// 기본값: 0, false, ' ', null
	
	// 사용자 정의 생성자 메소드 생략 시 클래스명과 동일하면서 '매개변수'가 없는 메소드가 생략된다
	Book () {}
	Book (String title, String publisher, int pageNumber) {
		this.title = title;
		this.publisher = publisher;
		this.pageNumber = pageNumber;
	}
}

public class D_Object {
	public static void main(String[] args) {
		Book myBook = new Book();
		System.out.println(myBook.title);// null
		System.out.println(myBook.publisher);// null
		System.out.println(myBook.pageNumber);// 0\
		
		Book anotherBook = new Book("백설공주", "코리아출판사", 50);
		Book thirdBook = new Book("신데렐라", "에이원플라자", 30);
		
		System.out.println(anotherBook.title);// 백설공주
		System.out.println(thirdBook.publisher);// 에이원플라자
		
		// 메소드 호출
		myBook.displayInfo();// null null
		anotherBook.displayInfo();// 백설공주 코리아출판사
		
		myBook.title = "개구리왕자";
		myBook.publisher = "개굴출판사";
		myBook.pageNumber = 100;
		
		myBook.displayInfo();// 개구리왕자 개굴출판사
		
		anotherBook.title = "콩쥐팥쥐";
		anotherBook.displayInfo();// 콩쥐팥쥐 코리아출판사
	}
}
