package todo_app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;
import todo_app.entity.Task;
import todo_app.respository.TaskRepository;
import todo_app.service.TaskService;

public class TaskServiceImpl implements TaskService{
	private final TaskRepository taskRepository;
	
	private static long taskId = 1;
	
	public TaskServiceImpl() {
		this.taskRepository = TaskRepository.getInstance();
	}
	
	private Long generateId() {
		return taskId++;
	}
	@Override
	public void createTask(TaskRequestDto dto) {
		Task task = new Task(generateId(), dto.getDoName(), dto.getDoCheck());
		
		taskRepository.save(task);
	}

	@Override
	public List<TaskResponseDto> getAllTasks() {
		List<TaskResponseDto> responseDtos = null;
		
		try {
			List<Task> tasks = taskRepository.findAll();
			
			responseDtos = tasks.stream()
					.map(task -> new TaskResponseDto(
							task.getDoId(), task.getDoName(), task.getDoCheck()))
					.collect(Collectors.toList());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return responseDtos;
	}

	@Override
	public List<TaskResponseDto> TaskfindById(Long id) {
		List<TaskResponseDto> responseDtos = null;
		
		try {
			List<Task> tasks = taskRepository.findAll();
			
			responseDtos = tasks.stream()
					.filter(task -> task.getDoId().equals(id))
					.map(equaledTesk -> new TaskResponseDto(
							equaledTesk.getDoId(), equaledTesk.getDoName(), equaledTesk.getDoCheck()
							))
					.collect(Collectors.toList());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return responseDtos;
	}
	
	@Override
	public List<TaskResponseDto> filterTasks(String doCheck) {
		List<TaskResponseDto> responseDtos = null;
		
		try {
			List<Task> tasks = taskRepository.findAll();
			
			responseDtos = tasks.stream()
					.filter(task -> task.getDoCheck().contains(doCheck))
					.map(filteredTask -> new TaskResponseDto(
							filteredTask.getDoId(), filteredTask.getDoName(), filteredTask.getDoCheck()))
					.collect(Collectors.toList());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return responseDtos;
	}
	

	@Override
	public void updateTask(Long id, TaskRequestDto dto) {
		try {
			Task task = taskRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("해당 id를 가진 환자를 조회할 수 없습니다." + id));
			
			task.setDoName(dto.getDoName());
			task.setDoCheck(dto.getDoCheck());
			
			taskRepository.save(task);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteTask(Long id) {
		try {
			Task task = taskRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("해당 id를 가진 환자를 조회할 수 없습니다." + id));
			
			taskRepository.delete(task);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


}
 