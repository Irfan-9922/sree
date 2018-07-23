/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package usecase3;

import java.util.List;

/**
 * @author :IRFAN
 *TIME:6:10:49 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class Order {
	private List<product>products;

	/**
	 * @return the products
	 */
	public List<product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<product> products) {
		this.products = products;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [products=" + products + "]";
	}

}
