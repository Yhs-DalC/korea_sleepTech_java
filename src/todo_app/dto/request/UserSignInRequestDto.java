package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignInRequestDto {
// 로그인
	private String userId;
	private String userPw;
}
