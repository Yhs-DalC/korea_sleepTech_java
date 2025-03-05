package user_reservation.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import user_reservation.entity.User;

public class UserRepository {
	private final List<User> users = new ArrayList<User>();
	
	public void save(User user) {
		users.add(user);
	}
	
	public Optional<User> findByUserId(String userId){
		// isPresentOrElse() 메소드: 존재할경우 isPresent 처리, 그렇지 않을 경우 orElse 처리
		
		return users.stream()
				.filter(user -> user.getUserId().equals(userId)).findFirst();
	}
}
