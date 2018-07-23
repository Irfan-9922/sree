/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package C;

/**
 * @author :IRFAN
 *TIME:2:54:32 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class Creq {
	private String name;
	private String item;
	private String locetion;
	private String qty;
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
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the locetion
	 */
	public String getLocetion() {
		return locetion;
	}
	/**
	 * @param locetion the locetion to set
	 */
	public void setLocetion(String locetion) {
		this.locetion = locetion;
	}
	/**
	 * @return the qty
	 */
	public String getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Creq [name=" + name + ", item=" + item + ", locetion=" + locetion + ", qty=" + qty + "]";
	}

}
