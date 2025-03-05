package chapter03;

import java.util.ArrayList;

public class F_Array {
	public static void main(String[] args) {
		/*
		 	크기 10의 ArrayList 생성
		 	1~10 까지의 숫자를 차례로 추가한 뒤 전체 리스트 출력후 전체 리스트 출력
		 	반복문 사용
		 	
		 	추가한 숫자 중 홀수만 제거하고 결과를 출력
		 	
		 	인덱스 3에 값 50을 삽입후 결과를 출력
		 */
		
		ArrayList<Integer> arrayList = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			arrayList.add(i + 1);
		}
		System.out.println(arrayList);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		//length = arrayList.size();
		for (int i = 0; i < arrayList.size(); i++) {
			// 리스트의 크기가 변동되기 때문에 크기값을 매번 동적으로 확인
			if(arrayList.get(i) % 2 != 0) {
				arrayList.remove(i);
				// 요소를 삭제하고 난 후 인덱스를 조정해야됨
				// 인덱스 조정을 하지 않을 경우 정상 동작이 되지 않는 경우
				// 연속된 요소를 제거할 때 
				i--;
			}
		}
		System.out.println(arrayList);// [2, 4, 6, 8, 10]
		
		arrayList.add(3, 50);
		System.out.println(arrayList);// [2, 4, 6, 50, 8, 10]
		
	}
}
