package bean;

import java.util.Date;
/**
 * 
 * @author ting
 *评论javabean类 {get，set}
 */
public class Comment {
	private int CPhone;	   //电话号码
	private Date CTime;	   //时间 
	private String CContent;    //	内容 
	private double CGrade;		///评分
	public int getCPhone() {
		return CPhone;
	}
	public void setCPhone(int cPhone) {
		CPhone = cPhone;
	}
	public Date getCTime() {
		return CTime;
	}
	public void setCTime(Date cTime) {
		CTime = cTime;
	}
	public String getCContent() {
		return CContent;
	}
	public void setCContent(String cContent) {
		CContent = cContent;
	}
	public double getCGrade() {
		return CGrade;
	}
	public void setCGrade(double cGrade) {
		CGrade = cGrade;
	}

}
