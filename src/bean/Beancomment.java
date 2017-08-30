package bean;

public class Beancomment {
	int id;
	String time;
	String comment;
	String CPhone;
	public String getCPhone() {
		return CPhone;
	}
	public void setCPhone(String cPhone) {
		CPhone = cPhone;
	}

	double Crank;
	public double getCrank() {
		return Crank;
	}
	public void setCrank(double d) {
		Crank = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String string) {
		this.time = string;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Beancomment(){
		
	}
	
}
