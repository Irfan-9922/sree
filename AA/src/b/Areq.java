package b;
/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */

/**
 * @author :IRFAN
 *TIME:10:30:54 am
 * DATE:11-May-2017
 *PROJECTNAME:AA
 */
public class Areq {
	private String channelId;
	private String clientId;
	private String reqId;
	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}
	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the reqId
	 */
	public String getReqId() {
		return reqId;
	}
	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Areq [channelId=" + channelId + ", clientId=" + clientId + ", reqId=" + reqId + "]";
	}
	

}
