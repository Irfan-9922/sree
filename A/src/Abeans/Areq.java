package Abeans;

public class Areq {
	private int oid;
	private String oname;
	@Override
	public String toString() {
		return "Areq [oid=" + oid + ", oname=" + oname + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}

}
