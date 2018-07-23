/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package B;

import C.c;
import C.creq;
import C.cres;

/**
 * @author :IRFAN
 *TIME:1:19:05 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class bb {
	public bres enroll(breq bq){
		creq c=new creq();
		c.setId(bq.getId());
		c.setName(bq.getName());
		c sd=new c();
		cres cc=sd.enroll(c);
		bres nn=new bres();
		nn.setCode(cc.getCode());
		nn.setStatus(cc.getStatus());
		return nn;
		
		
		
	}

	/**
	 * @param b
	 * @return
	 */
	

}
