package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignUpRequestDto {
// 회원가입
	private String userId;
	private String userPw;
	private String userPwcheck;
	private String nickName;
	private String email;
}
