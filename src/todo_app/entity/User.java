package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
	private Long id;
	private String userId;
	private String userPw;
	private String userPwcheck;
	private String nickName;
	private String email;
}
