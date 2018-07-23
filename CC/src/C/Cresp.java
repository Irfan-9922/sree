/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package C;

/**
 * @author :IRFAN
 *TIME:2:54:41 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class Cresp {
	private String status;
	private String ordeiId;
	private String prise;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the ordeiId
	 */
	public String getOrdeiId() {
		return ordeiId;
	}
	/**
	 * @param ordeiId the ordeiId to set
	 */
	public void setOrdeiId(String ordeiId) {
		this.ordeiId = ordeiId;
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
		return "Bresp [status=" + status + ", ordeiId=" + ordeiId + ", prise=" + prise + "]";
	}

}
