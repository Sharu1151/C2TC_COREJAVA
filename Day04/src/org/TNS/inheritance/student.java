package org.TNS.inheritance;

public class student  extends Day04{
	private int rollno;
	private String course;
	
	//public student() {
		//super();
	//}
	
	

	public student(long aadharNo, long phnNO, String address, int rollno, String course) {
		super(aadharNo, phnNO, address);
		this.rollno = rollno;
		this.course = course;
	}



	


	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", course=" + course + ", AadharNo=" + getAadharNo() + ", PhnNO="
				+ getPhnNO() + ", Address=" + getAddress() + "]";
	}






	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}

}

	