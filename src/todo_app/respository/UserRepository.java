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
	
	public void login(String userId, String userPw) {
		if(users.stream()
				.filter(user -> user.getUserId().equals(userId))
				.findFirst() != null) {
			if(users.stream()
					.filter(user -> user.getUserPw().equals(userPw))
					.findFirst() != null) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
	}
	public void logout() {
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	
	
	//회원 정보 관리 = CR(단건)D (+ 로그인, 로그아웃)
}
