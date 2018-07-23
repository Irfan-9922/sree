/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package usecase3;

/**
 * @author :IRFAN
 *TIME:6:13:26 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class Account {
	private String accnun;
	private String balance;
	/**
	 * @return the accnun
	 */
	public String getAccnun() {
		return accnun;
	}
	/**
	 * @param accnun the accnun to set
	 */
	public void setAccnun(String accnun) {
		this.accnun = accnun;
	}
	/**
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accnun=" + accnun + ", balance=" + balance + "]";
	}

}
