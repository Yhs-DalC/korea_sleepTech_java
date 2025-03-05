package chapter05;

// 음식점 클래스
// 다양한 방법으로 음식을 주문받는 매소드
class Restautant {
	// 메소드 정의: placeOrder()
	// 메뉴 이름 (String dish)
	// 메뉴 이름 * 수량 제공 (int quantity)
	// 메뉴 이름 * 특별 요청 사항 (String specialRequests)
	// 메뉴 이름 * 수량 제공 * 특별 요청 사항 
	
	void placeOrder(String dish) {System.out.println(dish);}
	void placeOrder(String dish, int quantity) {
		System.out.println(dish + " * " + quantity);
		}
	void placeOrder(String dish, String specialRequests) {
		System.out.println(dish + " - " + specialRequests);
		}
	void placeOrder(String dish, int quantity, String specialRequests) {
		System.out.println(dish + " * " + quantity+ " - " +specialRequests);
		}
}

public class G_Overloading {
	public static void main(String[] args) {
		Restautant restautant = new Restautant();
		
		restautant.placeOrder("햄버거");
		restautant.placeOrder("피자", 2);
		restautant.placeOrder("파스타", "소스 많이");
		restautant.placeOrder("샐러드", 3, "땅콩 빼고");
		
		
	}
}
