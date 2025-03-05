package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private Long doId;
	private String doName;
	private String doCheck;
	
	
}
