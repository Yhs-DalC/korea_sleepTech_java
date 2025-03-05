package chapter10.practice01;

// 시스템의 제품이 가져야 할 기본 속성과 메소드
abstract class Item {
	private final String id;
	private final String name;
	
	//Setter 역할 생성자
	public Item(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public abstract void display(); // 추상 메소드
	
}
