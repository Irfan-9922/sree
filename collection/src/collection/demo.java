package collection;

import java.io.Serializable;

public class demo implements Serializable{
	private int customer;
	private String name;
	private int dob;
	private int cdno;
	private int cvvno;
	private int exp;
	private int bal;
	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getCdno() {
		return cdno;
	}
	public void setCdno(int cdno) {
		this.cdno = cdno;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "demo [customer=" + customer + ", name=" + name + ", dob=" + dob + ", cdno=" + cdno + ", cvvno=" + cvvno
				+ ", exp=" + exp + ", bal=" + bal + "]";
	}

}
