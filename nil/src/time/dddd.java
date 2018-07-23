/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package time;



/**
 * @author :IRFAN
 *TIME:5:26:05 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
public class dddd {
	public static void main(String[] args) {
		
		Orders o=new Orders();
		
		o.setDesc("deleverd");
		o.setOrderid("12");
		customer c=new customer();
		c.setId("1212");
		c.setName("jim");
		c.setOrders(o);
		c.getId();
		c.getName();
		c.getOrders().getDesc();
		c.getOrders().getOrderid();
		System.out.println(c);
		
		
		
		System.out.println("kkk");
	}
	

}
