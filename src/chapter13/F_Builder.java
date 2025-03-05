package chapter13;

// 빌더로 게임 캐릭터 생성
// 필수: 이름, 분류
// 선택: 스킬, 아이템

class GameCharactor{
	// 필수
	private final String name;
	private final String sort;
	
	// 선택
	private final String skill;
	private final String item;
	
	// 1) 빌더 클래스
	public static class Builder{
		private final String name;
		private final String sort;
		
		private String skill = "Basic Attack";
		private String item = "none";
		
		// 생성자
		public Builder(String name, String sort) {
			this.name = name;
			this.sort = sort;
		}
		
		// 선택 필드에 대한 할당 메소드
		// 필드명 그 자체의 메소드명을 가진다
		public Builder skill(String skill) {
			this.skill = skill;
			return this;
 		}
		public Builder item(String item) {
			this.item = item;
			return this;
 		}
		
		public GameCharactor build() {
			return new GameCharactor(this);
		}
	}
	public GameCharactor(Builder builder) {
		this.name = builder.name;
		this.sort = builder.sort;
		this.skill = builder.skill;
		this.item = builder.item;
	}
}



public class F_Builder {
	public static void main(String[] args) {
		GameCharactor pororo = new GameCharactor.Builder("뽀로로", "팽귄")
				.skill("크롱 놀리기")
				.item("안경")
				.build();
		GameCharactor loopy = new GameCharactor.Builder("루피", "비버")
				.skill("정색")
				.item("잔망루피")
				.build();
	
	}
}
