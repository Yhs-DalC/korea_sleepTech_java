package todo_app;

import java.util.List;
import java.util.Scanner;

import todo_app.controller.TaskController;
import todo_app.controller.UserController;
import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.TaskResponseDto;
import todo_app.dto.response.UserResponseDto;

/*
 * TODO(할 일) 프로그램
 * 
 * 1. 프로젝트 개요
 * 할 일(TODO)에 대한 콘솔 기반 응용 프로그램
 * 두 도메인(사용자, 할 일)을 대상으로 회원가입, 로그인, 로그아웃, 회원 탈퇴 기능
 * 	, 할일에 대한 추가, 조회(단건/전체), 수정, 삭제 기능을 제공
 * 
 * +) 할일의 활성화 여부(할일 완료 여부)에 따른 필터링
 * 
 * 2.주요 기능 및 비즈니스 로직
 * 회원 정보 관리 = CR(단건)D (+ 로그인, 로그아웃)
 * 할일 기록 관리 = CR(단건/전체)UD (+ 필터링)
 * 
 * 3. 비즈니스 로직 구조
 * - Controller: 사용자의 입력을 처리하고 적절한 서비스 메소드를 호출
 * - Service: 핵심 비즈니스 로직을 수행
 * - Repository: 데이터 저장소와의 상호 작용을 담당
 * - DTO: 계층 간 데이터 전송을 위한 객체
 * - Entity: 데이터베이스 테이블과 매핑되는 도메인 객체
 * 
 *  4. 실행 및 관리
 * - Main Class (App.java): 프로그램의 실행 진입점, 사용자와의 상호작용을 관리하고 전체 흐름을 제어
 */

public class App {
	private static final Scanner sc = new Scanner(System.in);
	private static final TaskController TASK_CONTROLLER = new TaskController();
	private static final UserController USER_CONTROLLER = new UserController();
	
	public static void displayMenu() {
		System.out.println("\n [메뉴 선택]");
		System.out.println("1.회원 추가");
		System.out.println("2.회원 조회");
		System.out.println("3.회원 삭제");
		System.out.println("4.로그인");//error
		System.out.println("5.로그아웃");//error
		System.out.println("6.할 일 추가");
		System.out.println("7.할 일 전체 조회");
		System.out.println("8.할 일 단건 조회");
		System.out.println("9.할 일 필터링");
		System.out.println("10.할 일 업데이트");
		System.out.println("11.할 일 삭제");
		System.out.println("12.프로그램 종료");
		System.out.print("메뉴를 선택하세요: ");
	}
	
	private static int getChoice() {
		while(!sc.hasNextInt()) {
			System.out.println("숫자를 입력해주세요");
			sc.nextLine();
		}
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	private static String getInput(String prompt) {
		System.out.println(prompt + ": ");
		return sc.nextLine();
	}
	private static Long getIdInput() {
		String input = getInput("id를 입력하세요");
		return Long.parseLong(input);
	}
	private static TaskRequestDto createTaskRequest(){
		TaskRequestDto dto = null;
		
		try {
			String doName = getInput("할 일을 입력하세요");
			String doCheck = getInput("일의 진행상태를 입력하세요");
			
			dto = new TaskRequestDto(doName, doCheck);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return dto;
	}
	

	
	private static UserSignUpRequestDto createSignUpRequest() {
		UserSignUpRequestDto dto = null;
		
		try {
			String userId = getInput("id를 입력하세요");
			String userPw = getInput("비밀번호를 입력하세요");
			String userPwcheck = getInput("비밀번호 확인을 입력하세요");
			String nickName = getInput("닉네임을 입력하세요");
			String email = getInput("이메일을 입력하세요");
			
			dto = new UserSignUpRequestDto(userId, userPw, userPwcheck, nickName, email);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return dto;
	}
	
	private static boolean processChoice(int choice) {
		boolean loginCheck = false;
		switch(choice) {
		case 1:{
			UserSignUpRequestDto requestDto = createSignUpRequest();
			USER_CONTROLLER.createUser(requestDto);
			break;
		}
		case 2:{
			long id = getIdInput();
			UserResponseDto user = USER_CONTROLLER.findById(id);
			if(user == null) {
				System.out.println("해당하는 id의 유저가 없습니다");
			} else {
				System.out.println(user);
			}
			break;
		}
		case 3:{
			long id = getIdInput();
			USER_CONTROLLER.deleteUser(id);
			break;
		}
		case 4:{
			if(loginCheck == false) {
				String userId = getInput("id를 입력해주세요");
				String userPw = getInput("pw를 입력해주세요");
				loginCheck = USER_CONTROLLER.findByUserIdAndUserPw(userId, userPw);
				
			}else {
				System.out.println("이미 로그인되어 있습니다");
			}
			break;
			
		}
		case 5:{
			if(loginCheck == true) {
				USER_CONTROLLER.Logout();
				System.out.println("로그아웃 합니다");
				loginCheck = false;
			}else {
				System.out.println("로그인되어 있지 않습니다");
			}
			break;
		}
		case 6:{
			//할 일 추가
			TaskRequestDto requestDto = createTaskRequest();
			TASK_CONTROLLER.createTask(requestDto);
			break;
		}
		case 7:{
			//할 일 전체 조회
			List<TaskResponseDto> tasks = TASK_CONTROLLER.getAllTasks();
			if(tasks.isEmpty()) {
				System.out.println("환자 정보가 없습니다");
			} else {
				tasks.forEach(System.out::println);
			}
			break;
		}
		case 8:{
			//할 일 단건 조회
			Long id = getIdInput();
			List<TaskResponseDto> task = TASK_CONTROLLER.TaskfindById(id);
			if(task == null) {
				System.out.println("해당하는 id의 할 일이 없습니다");
			} else {
				System.out.println(task);
			}
			break;
		}
		case 9:{
			//할 일 필터링
			String doCheck = getInput("할 일의 상태를 입력해주세요");
			List<TaskResponseDto> tasks = TASK_CONTROLLER.filterTasks(doCheck);
			if(tasks == null) {
				System.out.println("해당하는 상태의 할 일이 없습니다");
			} else {
				System.out.println(tasks);
			}
			break;
		}
		case 10:{
			//할 일 업데이트
			Long id = getIdInput();
			TaskRequestDto requestDto = createTaskRequest();
			TASK_CONTROLLER.updateTask(id, requestDto);
		}
		break;
		
		case 11:{
			//할 일 삭제
			Long id = getIdInput();
			TASK_CONTROLLER.deleteTask(id);
		}
		break;
		case 12:{
			//프로그램 종료
			System.out.println("프로그램을 종료합니다");
			return false;
		}
		case 13:{
			//debug allUser
			List<UserResponseDto> users = USER_CONTROLLER.AllUsers();
			if (users.isEmpty()) {
				System.out.println("환자 정보가 없습니다.");
			} else {
				users.forEach(System.out::println);
			}
		}
		break;
		
		
		default:{
			System.out.println("잘못된 선택입니다.유효한 값을 입력해주세요");
		}
		break;
		}
		return true;
	}
	
	public static void main(String[] args) {
		try {
			while(true) {
				displayMenu();
				int choice = getChoice();
				
				if(!processChoice(choice)) break;
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
