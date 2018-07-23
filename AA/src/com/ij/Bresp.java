package com.ij;
/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */

/**
 * @author :IRFAN
 *TIME:10:36:03 am
 * DATE:11-May-2017
 *PROJECTNAME:BB
 */
public class Bresp {
	private String status;
	private String respmsg;
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
	 * @return the respmsg
	 */
	public String getRespmsg() {
		return respmsg;
	}
	/**
	 * @param respmsg the respmsg to set
	 */
	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bresp [status=" + status + ", respmsg=" + respmsg + "]";
	}

}
