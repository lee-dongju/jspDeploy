package kr.or.ddit.cookie.util;

import static org.junit.Assert.*;
import kr.or.ddit.file.FileUtil;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void getFileNameTest() {
		FileUtil fileUtil = new FileUtil();
		
		/***Given***/
		String contentDisposition = "form-data; name=\"uploadFile\"; filename=\"Koala.jpg\"";

		/***When***/
		String fileName = fileUtil.getFileName(contentDisposition);
		/***Then***/
//		assertEquals("Koala.jpg", fileName);
	}
}
