package todo_app.controller;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;
import todo_app.service.TaskService;
import todo_app.service.impl.TaskServiceImpl;

public class TaskController {
	private TaskService service;

	public TaskController() {
		this.service = new TaskServiceImpl();
	}
	public void createTask(TaskRequestDto dto) {
		service.createTask(dto);
	}
	
	public List<TaskResponseDto> getAllTasks(){
		return service.getAllTasks();
	}
	public List<TaskResponseDto> TaskfindById(Long id){
		return service.TaskfindById(id);
	}
	
	public List<TaskResponseDto> filterTasks(String doCheck){
		return service.filterTasks(doCheck);
	}
	
	public void updateTask(Long id, TaskRequestDto dto) {
		service.updateTask(id, dto);
	}
	
	public void deleteTask(Long id) {
		service.deleteTask(id);
	}
}

