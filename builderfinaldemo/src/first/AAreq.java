/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package first;

/**
 * @author :IRFAN
 *TIME:5:31:37 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderfinaldemo
 */
public class AAreq {
	private String accno;
	private String pass;
	/**
	 * @return the accno
	 */
	public String getAccno() {
		return accno;
	}
	/**
	 * @param accno the accno to set
	 */
	public void setAccno(String accno) {
		this.accno = accno;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AAreq [accno=" + accno + ", pass=" + pass + "]";
	}
	

}
