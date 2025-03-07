package todo_app.respository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import todo_app.entity.User;

public class UserRepository {
	List<User> users = new ArrayList<User>();
	
	private static final UserRepository instance = new UserRepository();
	
	private UserRepository() {}
	
	public static UserRepository getInstance() {
		return instance;
	}
		
	public void save(User newUser) {
		users.add(newUser);
	}
	
	public Optional<User> findById(Long id){
		return users.stream()
				.filter(user -> user.getId().equals(id))
				.findFirst();
	}
	
	public void delete(User user) {
		users.remove(user);
	}
	
	//findByUserIdAndUserPw
	// 리스트의 id/pw를 Optional에 넣은 후 isEmpty로 널값이 아닌걸 확인하고 입력값과 비교하기!!
	public boolean findByUserIdAndUserPw(String userId, String userPw) {//String userId, String userPw;
		boolean idck = false;
		boolean pwck = false;
		
		if(userId != null) {
			for(User id : users) {
				if(id.getUserId().equals(userId)) {
					idck = true;
					break;
				}
			}
		}
		
		for(User pw : users) {
			if(pw.getUserPw().equals(userPw)) {
				pwck = true;
				break;
			}
		}
		if(idck && pwck) {
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
		//Optional<Boolean> optionalId = Optional.ofNullable(
//		Optional<Boolean> optionalPw = Optional.ofNullable(users.stream()
//				.findFirst().equals(userPw));
//		boolean checkId = optionalId.isEmpty();
//		boolean checkPw = optionalPw.isEmpty();
//		System.out.println(checkId);
//		System.out.println(checkPw);
//		if(checkId && checkPw) {
//			System.out.println("로그인 성공");
//			return true;
//		}
//		Optional<dto> optional = Optional.ofNullable(users);//에러 null 넣으면 널값만 인식해요
	
//		if(!optional.isEmpty()) {
//			System.out.println("안비어있음");
//			if(optional.get().forEach(List user: users){//자료형 반복돌릴대상: 반복횟수
//				userId.equals(userId))
//			}
//				
//				
//				
//				
//				System.out.println("userid");
//				if(optional.get().getUserPw().equals(userPw)) {
//					System.out.println("로그인 성공");
//					return true;
//				} else {
//				System.out.println("비밀번호가 일치하지 않습니다");
//				}
//			}else {
//				System.out.println("아이디가 일치하지 않습니다");
//			}
//		}else {
//			System.out.println("User가 비어있습니다");
//		}
//		Optional<List<User>> optional = Optional.of(users);
//		if(!optional.isEmpty()) {
//			System.out.println("안비어있음");
//			if(optional.get().stream()
//					//.filter(userId -> userId)
//					.findFirst().equals(userId)) {
//				System.out.println("userid");
////				if(optional.get().getUserPw().equals(userPw)) {
////					System.out.println("로그인 성공");
////					return true;
////				} else {
////				System.out.println("비밀번호가 일치하지 않습니다");
////				}
//			}else {
//				System.out.println("아이디가 일치하지 않습니다");
//			}
//		}else {
//			System.out.println("User가 비어있습니다");
//		}
		
		//---------------------------------------------
//		if(users.stream()
//				.filter(user -> user.getUserId().equals(userId))
//				.findFirst() != null) {
//			
//			if(users.stream()
//					.filter(user -> user.getUserPw().equals(userPw))
//					.findFirst() != null) {
//				
//				System.out.println("로그인 성공");
//				return true;
//			} else {
//				System.out.println("비밀번호가 일치하지 않습니다");
//			}
//		} else {
//			System.out.println("아이디가 일치하지 않습니다");
//		}
	}
	public void logout() {
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	
	
	//회원 정보 관리 = CR(단건)D (+ 로그인, 로그아웃)
}
