package kr.or.ddit.lprod.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.mybatis.SqlMapSessionFactory;

public class LprodDao implements LprodDaoInf {

	private SqlSessionFactory SqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory();
	/**
	 * 
	 * Method : selectAllLprod
	 * 최초작성일 : 2018. 7. 9.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 Lprod테이블 정보를 조회.
	 */
	@Override
	public List<LprodVo> selectAllLprod() {
		SqlSession session = SqlSessionFactory.openSession();
		List<LprodVo> lprodList = session.selectList("lprod.selectAllLprod");
		session.close();
		
		return lprodList;
	}
	
	/**
	 * 
	 * Method : getLprodPageList
	 * 최초작성일 : 2018. 7. 11.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param map
	 * @return
	 * Method 설명 : lprod 페이지 리스트 조회
	 */
	@Override
	public List<LprodVo> getLprodPageList(Map<String, Integer> map) {
		SqlSession session = SqlSessionFactory.openSession();
		List<LprodVo> lprodList = session.selectList("lprod.getLprodPageList", map);
		session.close();
		
		return lprodList;
	}

	@Override
	public int getLprodTotCnt() {
		SqlSession session = SqlSessionFactory.openSession();
		int result = session.selectOne("lprod.getLprodTotCnt");
		session.close();
		
		return result;
	}
}
