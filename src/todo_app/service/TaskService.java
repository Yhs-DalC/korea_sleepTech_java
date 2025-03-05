package todo_app.service;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;

public interface TaskService {
	void createTask(TaskRequestDto dto);
	List<TaskResponseDto> getAllTasks();
	List<TaskResponseDto> TaskfindById(Long id);
	List<TaskResponseDto> filterTasks(String doCheck);
	void updateTask(Long id, TaskRequestDto dto);
	void deleteTask(Long id);
}
