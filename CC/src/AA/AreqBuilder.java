/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package AA;

import B.Breq;

/**
 * @author :IRFAN
 *TIME:3:29:50 pm
 * DATE:12-May-2017
 *PROJECTNAME:CC
 */
public class AreqBuilder {
	public Breq m1(Areq11 areq){
		System.out.println("from areq builder");
		Breq breq=new Breq();
		breq.setItem(areq.getItem());
		breq.setLocetion(areq.getLocetion());
		breq.setName(areq.getName());
		breq.setQty(areq.getQty());
		return breq;
	}

}
