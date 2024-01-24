package org.TNS.inheritance;

public class Day04  {
	private long aadharNo;
	private long phnNO;
	private String Address;
	
	
	
	public Day04(long aadharNo, long phnNO, String address) {
		super();
		this.aadharNo = aadharNo;
		this.phnNO = phnNO;
		this.Address = address;
	}


	@Override
	public String toString() {
		return "Day04 [aadharNo=" + aadharNo + ", phnNO=" + phnNO + ", Address=" + Address + "]";
	}


	public long getAadharNo() {
		return aadharNo;
	}


	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}


	public long getPhnNO() {
		return phnNO;
	}


	public void setPhnNO(long phnNO) {
		this.phnNO = phnNO;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}

}
	
		


	