package kr.or.ddit.lprod.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Test;

public class LprodDaoTest {

	@Test
	public void test() {
		/***Given***/
		LprodDaoInf lprodDao = new LprodDao();

		/***When***/
		List<LprodVo> lprodList = lprodDao.selectAllLprod();
		for(LprodVo vo : lprodList){
//			System.out.println(vo);
		}
		
		/***Then***/
//		assertEquals(12, lprodList.size());
	}
	
	@Test
	public void getLprodPageListTest(){
		/***Given***/
		LprodDaoInf lprodDao = new LprodDao();

		/***When***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("page", 1);
		map.put("pageSize", 2);
		
		List<LprodVo> lprodList = lprodDao.getLprodPageList(map);
		for(LprodVo vo : lprodList){
			System.out.println(vo);
		}
		
		/***Then***/
		assertEquals(2, lprodList.size());
	}
	
	@Test
	public void getLprodTotCntTest(){
		/***Given***/
		LprodDaoInf lprodDao = new LprodDao();

		/***When***/
		int lprodTotal = lprodDao.getLprodTotCnt();
		System.out.println(lprodTotal);
		/***Then***/
		
		assertEquals(12, lprodTotal);
	}
}
