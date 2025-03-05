package chapter01;

import java.util.Scanner;

public class F_IO {
	// class 파일 내부의 실행을 담당하는 메인 메소드
	public static void main(String[] args) {
		// 자바의 기본 입출력(Input/Output >> IO)
		// 입력: 콘솔창을 통해 개발자로부터 입력을 받는 것
		// 출력: 콘솔창으로 데이터를 출력하는 것
		
		// 출력
		// System.out.println(출력하고자 하는 것);
		// syso 단축키로 자동완성
		System.out.println("안녕하세요");// ln(line) : 주어진 값을 콘솔에 출력하고 줄바꿈
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.print("반갑습니다");
		System.out.println(".");
		
		// 입력
		// 자바 내장 기능 Scanner 객체를 사용
		// 다양한 입력 소스로부터 데이터를 읽어올 수 있는 형태
		// System.in (콘솔 창에서 표준 입력 스트림을 사용)
		// import java.util.Scanner;
		
		// Scanner(스캐너타입) scanner(변수명) = new Scanner(System.in);
		// new Scanner(입력받을 방법) 새로운 스캐너 생성
		// System.in : 현재 실행되는 프로그램의 콘솔에서 입력받음
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너 실행
		// 스캐너명/next(); : 입력 내용을 문자열로 반환
		// 스캐너명/nextLine(); : 엔터까지의 전체 입력 내용을 문자열로 반환
		// 스캐너명/nextInt(); : 엔터까지의 전체 입력 내용을 숫자로 반환
		// 스캐너명/next데이터타입(); : 엔터까지의 전체 입력 내용을 해당 데이터타입으로 반환
		
		System.out.println("나이를 입력해주세요.");
		int age = scanner.nextInt();
		// 개행문자는 버퍼의 공간에 저장됨(임시공간)
	
		System.out.println("키를 입력해주세요.");
		int height = scanner.nextInt();
		// nextInt()후 남아있는 버퍼 처리
		// nextLine()에 자동 개행문자 처리 기능이 없기 때문
		scanner.nextLine();
		
		System.out.println("이름을 입력해주세요.");
		String name = scanner.nextLine();
		
		System.out.println("입력한 나이: " + age);
		System.out.println("입력한 키: " + height);
		System.out.println("입력한 이름: " + name);
		
		// 개행문자(Enter) + 버퍼
		// nextInt(), nextDouble() 의 경우
		// 버퍼에 개행 문자가 입력으로 처리되는 문제가 발생
		// 처리방법 : nextLine()의 입력 메소드 호출로 버퍼의 데이터를 사용(Enter 소멸)
		
		// 스캐너 종료 방법
		// 스캐너 사용 후 메모리 최적화를 위해 스캐너 종료
		// 스캐너명.close();
		scanner.close();
		//scanner.next();//java.lang.IllegalStateException: Scanner closed
		
	}
}
