package todo_app.respository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public boolean findByUserIdAndUserPw(String userId, String userPw) {
		if(users.stream()
				.filter(user -> user.getUserId().equals(userId))
				.findFirst() != null) {
			
			if(users.stream()
					.filter(user -> user.getUserPw().equals(userPw))
					.findFirst() != null) {
				
				System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
		return false;
	}
	public void logout() {
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	
	
	//회원 정보 관리 = CR(단건)D (+ 로그인, 로그아웃)
}
