/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package usecase3;

/**
 * @author :IRFAN
 *TIME:6:11:50 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class product {
	private String pname;
	private String prise;
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the prise
	 */
	public String getPrise() {
		return prise;
	}
	/**
	 * @param prise the prise to set
	 */
	public void setPrise(String prise) {
		this.prise = prise;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "product [pname=" + pname + ", prise=" + prise + "]";
	}
	

}
