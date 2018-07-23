/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package time;

/**
 * @author :IRFAN
 *TIME:5:26:31 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
public class customer {
	private Orders orders;
	private String id;
	private String name;
	/**
	 * @return the orders
	 */
	public Orders getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "customer [orders=" + orders + ", id=" + id + ", name=" + name + "]";
	}
	

}
