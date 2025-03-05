package todo_app.controller;

import java.util.List;

import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.entity.User;
import todo_app.service.UserService;
import todo_app.service.impl.UserServiceImpl;

public class UserController {
	private UserService service;
	
	public UserController() {
		this.service = new UserServiceImpl();
	}
	public void createUser(UserSignUpRequestDto dto) {
		service.createUser(dto);
	}
	
	public UserResponseDto findById(Long id) {
		UserResponseDto user = service.findById(id);
		return user;
	}
	
	public void deleteUser(Long id) {
		service.deleteUser(id);
	}
	
	public void Login(String userId, String UserPw) {
		service.Login(userId, UserPw);
		
	}
	public void Logout() {
		service.Logout();
		
	}
	public List<UserResponseDto> AllUsers(){
		List<UserResponseDto> users = service.AllUsers();
		return users;
	}
	
}
