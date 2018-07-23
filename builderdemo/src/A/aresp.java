/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package A;

/**
 * @author :IRFAN
 *TIME:1:18:34 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class aresp {
	private String Status;
	private String code;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "aresp [Status=" + Status + ", code=" + code + "]";
	}

}
