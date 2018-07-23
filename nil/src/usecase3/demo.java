/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package usecase3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :IRFAN
 *TIME:6:31:20 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<product> p=new ArrayList<product>();
		product pd=new product();
		pd.setPname("mobile");
		pd.setPrise("7000");
		p.add(pd);
		Order o=new Order();
		
		Account ac=new Account();
		
		customer c=new customer();
		if(c!=null && ac.getAccnun()!=null && c.getOrder()!=null && pd!=null && p.size()!=0 && p.isEmpty()!=true)
		ac.setAccnun("1212");
		ac.setBalance("3333");
		o.setProducts(p);
		c.setAccount(ac);
        c.setOrder(o);   
        //getting data
        c.getOrder();
        c.getAccount();
        System.out.println(c);
		
		
		

	}

}
