package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//CRUD 기능의 메소드 구현
	//글 등록
	void insertBoard(BoardVO vo);
	//글 수정
	void updateBoard(BoardVO vo);
	//글 삭제
	void deleteBoard(BoardVO vo);
	//글 찾아오기
	BoardVO getBoard(BoardVO vo);
	//글 목록 불러오기
	List<BoardVO> getBoardList(BoardVO vo);

}