package bean;

import java.util.Date;
/**
 * 
 * @author ting
 *����javabean�� {get��set}
 */
public class Comment {
	private int CPhone;	   //�绰����
	private Date CTime;	   //ʱ�� 
	private String CContent;    //	���� 
	private double CGrade;		///����
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
