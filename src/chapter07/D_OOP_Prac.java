package chapter07;

// 도서 관리 시스템
// 책의 정보를 저장, 책의 상태(대여 가능 여부) 확인, 책의 정보 출력

// Book 클래스
// 속성: title(String, 불변성), author(String, 불변성), isAvailable(boolean)
// 메소드: borrowBook(), returnBook(), displayInfo()
// 생성자: 매개변수 - title, author

class Book{
	private final String title;
	private final String author;
	private boolean isAvailable = true;// 책의 초기 상태: 대여 가능
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 책 대여 메소드
	void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("책 대여가 성공적으로 완료되었습니다");
		} else {
			System.out.println("현재 대여 중입니다");
		}
	}
	
	// 책 반납 메소드
	void returnBook() {
		if(!isAvailable) {
			isAvailable = true;
			System.out.println("책 반납이 성공적으로 이루어졌습니다");
		} else {
			System.out.println("책이 이미 반납된 상태입니다");
		}
	}
	
	// 책 정보 출력 메소드
	void displayInfo() {
		System.out.println("제목: " + title
				+ ", 저자: " + author
				+ ", 대여 가능 여부: " + (isAvailable ? "대여 가능" : "대여 중")
		);
	}
	
	// 캡슐화를 위한 getter 메소드 추가
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
}

// EBook 클래스 - Book 클래스를 상속
// 추가 속성: fileSize(double)
// 추가 메소드: displayInfo() 재정의>> fileSize()
// 생성자: EBook(title, author, fileSize)
class EBook extends Book{
//	EBook(){
//		super(); >> 빈 슈퍼 생성자가 존재하지 않음
//	}
	
	private double fileSize;
	
	EBook(String title, String author, double fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("파일 크기" + fileSize + "MB");
	}
	
	double getFileSize() {
		return fileSize;
	}
}


public class D_OOP_Prac {
	public static void main(String[] args) {
		// Book 객체 생성
		Book book1 = new Book("역사의쓸모", "최태성");
		book1.displayInfo();// 제목: 역사의쓸모, 저자: 최태성, 대여 가능 여부: 대여 가능
		book1.borrowBook();// 책 대여가 성공적으로 완료되었습니다
		book1.displayInfo();// 제목: 역사의쓸모, 저자: 최태성, 대여 가능 여부: 대여 중
		book1.borrowBook();// 현재 대여 중입니다
		book1.returnBook();// 책 반납이 성공적으로 이루어졌습니다
		book1.returnBook();// 책이 이미 반납된 상태입니다

		//EBook 객체 생성
		EBook eBook1 = new EBook("스위트 스팟", "샘 리처드", 131.23);
		eBook1.displayInfo();
		// 제목: 스위트 스팟, 저자: 샘 리처드, 대여 가능 여부: 대여 가능
		// 파일 크기131.23MB << 재정의 된 메소드(확장)
		eBook1.borrowBook();// 책 대여가 성공적으로 완료되었습니다
	}
}
