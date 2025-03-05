package chapter05;

class BaseBallPlayer {
	String name;
	double battingAverate;
	int homeRuns;
	
	static int playerCount;
	
	BaseBallPlayer(String name, double battingAverate, int homeRuns) {
		this.name = name;
		this.battingAverate = battingAverate;
		this.homeRuns = homeRuns;
		
		playerCount++;
	}
	
	// 인스턴스 메소드
	void UpdateStatus(double newBattingAverage, int newHomeRuns) {
		battingAverate = newBattingAverage;
		homeRuns = newHomeRuns;
	}
	
	// 정적 메소드
	// 특정 홈런 수 이상인 선수를 평가
	static String evaluateHomeRun(int homeRunCount) {
		if(homeRunCount > 20) {
			return "홈런상 후보에 등록됩니다";
		} else {
			return "홈런상 후보에 등록될 수 없습니다";
		}
	}
}

public class E_Practice {
	public static void main(String[] args) {
		// 인스턴스 생성
		BaseBallPlayer player1 = new BaseBallPlayer("윤영서", 0.325, 16);
		BaseBallPlayer player2 = new BaseBallPlayer("문창배", 0.293, 20);
		BaseBallPlayer player3 = new BaseBallPlayer("전창현", 0.301, 11);
		BaseBallPlayer player4 = new BaseBallPlayer("고혁재", 0.292, 21);
		
		System.out.println("총 생성된 선수의 수: " + BaseBallPlayer.playerCount);// 총 생성된 선수의 수: 4

		
		player2.UpdateStatus(0.312, 22);
		System.out.println(player2.battingAverate);
		System.out.println(player2.homeRuns);
		
		System.out.println(BaseBallPlayer.evaluateHomeRun(player3.homeRuns));// 홈런상 후보에 등록될 수 없습니다
		System.out.println(BaseBallPlayer.evaluateHomeRun(player4.homeRuns));// 홈런상 후보에 등록됩니다
	}
}
