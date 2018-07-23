/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package time;

/**
 * @author :IRFAN
 *TIME:5:27:45 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
public class Orders {
	private String orderid;
	private String desc;
	/**
	 * @return the orderid
	 */
	public String getOrderid() {
		return orderid;
	}
	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", desc=" + desc + "]";
	}
	

}
