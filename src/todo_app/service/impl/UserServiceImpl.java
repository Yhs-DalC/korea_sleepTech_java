package todo_app.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.Builder;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.TaskResponseDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.entity.Task;
import todo_app.entity.User;
import todo_app.respository.UserRepository;
import todo_app.service.UserService;


public class UserServiceImpl implements UserService{
	private final UserRepository userRepository;
	private static long currentId = 1;
	
	public UserServiceImpl() {
		this.userRepository = UserRepository.getInstance();
	}
	
	private Long generateId() {
		return currentId++;
	}
	@Override
	public void createUser(UserSignUpRequestDto dto) {
		User user = new User(
				generateId(), dto.getUserId(), dto.getUserPw(), dto.getUserPwcheck(), dto.getNickName(), dto.getEmail()
				);
		String password = dto.getUserPw();
		String passwordChcek = dto.getUserPwcheck();
		try {
			if(!password.equals(passwordChcek)) {
				throw new Error("비밀번호와 비밀번호 확인이 다릅니다");
			}
			userRepository.save(user);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public UserResponseDto findById(Long id) {
		UserResponseDto responseDto = null;
	
		try {
			User user = userRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("해당 id를 가진 유저를 조회할 수 없습니다." + id));
				
			responseDto = new UserResponseDto(user.getUserId(), user.getNickName());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return responseDto;
	}
	@Override
	public List<UserResponseDto> AllUsers() {
		List<User> users = userRepository.findAll();
		
		List<UserResponseDto> responseDtos = users.stream()
				.map(user -> new UserResponseDto(user.getUserId(), user.getNickName()))
				.collect(Collectors.toList());
		
		return responseDtos;
	}

	@Override
	public void deleteUser(Long id) {
		try {
			User user = userRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("해당 id를 가진 유저를 조회할 수 없습니다." + id));
			
			userRepository.delete(user);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public boolean findByUserIdAndUserPw(String userId, String UserPw) {
		return userRepository.findByUserIdAndUserPw(userId, UserPw);//
	}

	@Override
	public void Logout() {
	}
}
	
