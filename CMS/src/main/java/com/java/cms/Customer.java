package com.java.cms;

public class Customer {
	private int customerid;
	private String customername;
	private String customerstate;
	private String customercity;
	private String customermail;
	private String customermobile;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerstate() {
		return customerstate;
	}
	public void setCustomerstate(String customerstate) {
		this.customerstate = customerstate;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getCustomermail() {
		return customermail;
	}
	public void setCustomermail(String customermail) {
		this.customermail = customermail;
	}
	public String getCustomermobile() {
		return customermobile;
	}
	public void setCustomermobile(String customermobile) {
		this.customermobile = customermobile;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerstate="
				+ customerstate + ", customercity=" + customercity + ", customermail=" + customermail
				+ ", customermobile=" + customermobile + "]";
	}
	
	

}
