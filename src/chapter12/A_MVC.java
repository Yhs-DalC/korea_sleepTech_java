package chapter12;

// MVC 패턴
// Model(모델), View(뷰), Controller(컨트롤러)
// 사용자가 인터페이스를 설계하는 소프트웨어 디자인 패턴 중 하나
// 세 가지 구성 요소로 나누어 개발을 진행(역할 분담)

// # 디자인 패턴
// 소프트웨어 디자인 과정에서 자주 발생하는 문제들에 대해 일반적인 해결책

/*
 * Model(모델): 애플리케이션의 데이터와 비즈니스 로직을 담당
 * 데이터베이스, 파일 시스템, 외부 서비스와의 통신을 통해 데이터를 저장하고 검색
 *  - 상태 변경에 대해 View와 Controller에게 알릴 수 있는 메커니즘을 제공
 *  - View와 Controller의 세부 구현사항으로부터 독립적
 *  
 * View(뷰): 사용자에게 데이터를 표시하는 방법을 정의
 *  - Model의 정보를 표시, 사용자 액션을 Controller에게 전달
 *  - Model이 가진 정보를 사용자가 이해할 수 있는 형태로 변환
 * 
 * Controller(컨트롤러): 사용자의 입력을 처리하고 Model과 View 사이의 상호작용을 관리
 * - 사용자의 입력에 반응하여 Model을 업데이트하고, 필요한 경우 View를 새롭게 출력
 * 
 * MVC 패턴 장점
 * - 역할 분담: 각 구성요소가 독립적인 기능을 책임 > 코드 관리 & 확장에 용이
 * - 유지 보수 용이: 애플리케이션의 비즈니스 로직과 사용자 인터페이스(User Interface)가 분리되어 유지보수가 쉬움
 * 
 * MVC 패턴 단점
 * - 복잡성 증가: 간단한 애플리케이션 구현에는 MVC패턴의 구조가 복잡성을 증가시킴
 * - 학습 곡선 높음: 이해하고 사용하기까지 일정한 학습이 필요
 * 
 * MVC 패턴의 작동 원리
 * View >> Controller >> Model >> Controller >> View
 * 
 * # Spring: 자바 기반의 웹 프레임워크
 * >> Spring MVC(Spring Boot)
 */

// Model: 데이터를 저장
class LunchMenu{
	private String menu;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
}
// View: 화면에 보여지는 역할
class LunchView{
	public void displayMenu(String menu) {
		System.out.println("오늘의 급식 메뉴는: " + menu);
	}
}
// Controller: 모델과 뷰를 연결하는 역할
class LunchController{
	private LunchMenu model;
	private LunchView view;
	
	public LunchController(LunchMenu model, LunchView view) {
		this.model = model;
		this.view = view;
	}
	
	// 모델에 데이터를 저장
	public void setLunchMenu(String menu) {
		model.setMenu(menu);
	}
	
	// 모델 데이터를 뷰에 전달
	public void updateView() {
		String menu = model.getMenu();
		view.displayMenu(menu);
	}
}

public class A_MVC {
	public static void main(String[] args) {
		// 학교 급식 시스템
		
		// Model : 데이터 담당
		// 학교 급식표와 실제 음식 데이터를 담당
		// 급식표에 메뉴를 적는 역할
		
		// View : 화면 담당
		// 학생들에게 급식표를 보여줌
		// 쉽게 알아볼 수 있도록 작성(User Interface)
		
		// Controller : 연결 담당
		// >> 사용자의 요청(입력)을 '제어'
		// 모델과 뷰 사이의 통역사
		// 학생의 요청을 급식표에 반영하고 급식표를 업데이트함
		
		LunchMenu menu = new LunchMenu();
		LunchView view = new LunchView();
		
		LunchController controller = new LunchController(menu, view);
		
		controller.setLunchMenu("김밥, 떡볶이, 콜라");
		controller.updateView();//오늘의 급식 메뉴는: 김밥, 떡볶이, 콜라
		
		controller.setLunchMenu("김밥, 매운떡볶이, 콜라");//오늘의 급식 메뉴는: 김밥, 매운떡볶이, 콜라
		controller.updateView();
	}
}
