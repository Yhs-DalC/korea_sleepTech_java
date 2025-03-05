package chapter15.boardApp.service;

import java.util.List;

import chapter15.boardApp.dto.BoardRequestDto;
import chapter15.boardApp.dto.BoardResponseDto;

public interface BoardService {
	// CR(전체/단건)UD
	void createBoard(BoardRequestDto dto);
	
	// 전체 조회
	List<BoardResponseDto> findAllBoards();
	// 단건 조회
	BoardResponseDto findBoardById(long id);
	
	void updateBoard(long id, BoardRequestDto dto);
	
	void deleteBoard(long id);

}
