/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package Intigretion;

/**
 * @author :IRFAN
 *TIME:4:07:10 am
 * DATE:13-May-2017
 *PROJECTNAME:irfan_jax_ws_example
 */
public class vbresp {
	private String responceCode;
	private String respmessage;
	/**
	 * @return the responceCode
	 */
	public String getResponceCode() {
		return responceCode;
	}
	/**
	 * @param responceCode the responceCode to set
	 */
	public void setResponceCode(String responceCode) {
		this.responceCode = responceCode;
	}
	/**
	 * @return the respmessage
	 */
	public String getRespmessage() {
		return respmessage;
	}
	/**
	 * @param respmessage the respmessage to set
	 */
	public void setRespmessage(String respmessage) {
		this.respmessage = respmessage;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "vbresp [responceCode=" + responceCode + ", respmessage=" + respmessage + "]";
	}

}
