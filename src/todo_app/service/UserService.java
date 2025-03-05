package todo_app.service;



import java.util.List;

import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.entity.User;


public interface UserService {
	void createUser(UserSignUpRequestDto dto);
	UserResponseDto findById(Long id);
	void deleteUser(Long id);
	boolean findByUserIdAndUserPw(String userId, String UserPw);//
	void Logout();
	public List<UserResponseDto> AllUsers();
	
}
		