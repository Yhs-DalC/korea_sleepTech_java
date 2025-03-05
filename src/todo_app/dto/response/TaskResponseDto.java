package todo_app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResponseDto {
	private Long doId;
	private String doName;
	private String doCheck;
}
