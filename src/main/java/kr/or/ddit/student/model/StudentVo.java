package kr.or.ddit.student.model;

import java.util.Date;

/**
 * StudentVo.java
 *
 * @author pc19
 * @since 2018. 7. 17.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 7. 17. pc19 최초 생성
 *
 * </pre>
 */
public class StudentVo {
	private int id;			//학생번호
	private String name;	//학생이름
	private int call_cnt;	//호출횟수
	private Date reg_dt;	//입력한 날짜
	private String addr1;	//주소
	private String addr2;	//주소2
	private String zipcd;	//우편번호
	private String pic;		//프로필사진-실제사진이름
	private String picpath; //프로필사진 파일경로
	private String picname; //프로필사진-물리사진이름
	
	

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public StudentVo(){
		
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	public Date getReg_dt() {
		return reg_dt;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCall_cnt() {
		return call_cnt;
	}
	public void setCall_cnt(int call_cnt) {
		this.call_cnt = call_cnt;
	}
	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcd() {
		return zipcd;
	}

	public void setZipcd(String zipcd) {
		this.zipcd = zipcd;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", call_cnt="
				+ call_cnt + ", reg_dt=" + reg_dt + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", zipcd=" + zipcd + ", pic=" + pic
				+ ", picpath=" + picpath + ", picname=" + picname + "]";
	}
}
