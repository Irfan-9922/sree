/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package first;

import second.BBreq;

/**
 * @author :IRFAN
 *TIME:6:20:05 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderfinaldemo
 */
public class Abuilder {
	public BBreq m1(AAreq req){
		System.out.println("from builder"+req);
		BBreq b=new BBreq();
		b.setAccno(req.getAccno());
		b.setPass(req.getPass());
		return b;
		
	}
}
