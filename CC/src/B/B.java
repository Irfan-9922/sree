/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package B;

import C.C;
import C.Creq;
import C.Cresp;

/**
 * @author :IRFAN
 *TIME:2:53:42 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class B {
	public Bresp m1(Breq breq){
		Creq c=new Creq();
		c.setItem(breq.getItem());
		c.setLocetion(breq.getLocetion());
		c.setName(breq.getName());
		c.setQty(breq.getQty());
		C cc=new C();
		Cresp ff=cc.m1(c);
		Bresp b=new Bresp();
		b.setOrdeiId(ff.getOrdeiId());
		b.setPrise(ff.getPrise());
		b.setStatus(ff.getStatus());
		
		return b;
	}

}
