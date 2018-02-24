package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		//1.Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring 컨테이너로부터 sBoardServiceImpl 객체를 lookup 한다
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3.글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("킴썽안뇽?");
		vo.setWriter("망고망고");
		vo.setContent("저는 지금 열심히 코딩중입니당");
		boardService.insertBoard(vo);

		//4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("--->" + board.toString());
		}
	
	
		//5. Spring 컨테이너 종료
		
		container.close();
	}

}
