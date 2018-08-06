package kr.or.ddit.board.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.or.ddit.board.model.BoardVo;

public class BoardService implements BoardServiceInf {

	/**
	 * 
	 * Method : getBoardList
	 * 최초작성일 : 2018. 7. 5.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @return
	 * Method 설명 : 게시글 목록 조회
	 */
	@Override
	public List<BoardVo> getBoardList() {
		List<BoardVo> boardList = new ArrayList<BoardVo>();
		
		//db에 조회가 되었다고 가정하고 임의의 값을 리턴
		boardList.add(new BoardVo("첫번째 글입니다.", "첫번째 내용입니다.", "LDJ1", "동주1", new Date()));
		boardList.add(new BoardVo("두번째 글입니다.", "두번째 내용입니다.", "LDJ2", "동주2", new Date()));
		boardList.add(new BoardVo("세번째 글입니다.", "셋번째 내용입니다.", "LDJ3", "동주3", new Date()));
		boardList.add(new BoardVo("네번째 글입니다.", "네번째 내용입니다.", "LDJ4", "동주4", new Date()));
		boardList.add(new BoardVo("다섯번째 글입니다.", "다섯번째 내용입니다.", "LDJ5", "동주5", new Date()));
		
		return boardList;
	}
}
