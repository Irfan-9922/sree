/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package usecase3;

/**
 * @author :IRFAN
 *TIME:6:09:53 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class customer {
	private Order order;
	private Account account;
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "customer [order=" + order + ", account=" + account + "]";
	}
	

}
