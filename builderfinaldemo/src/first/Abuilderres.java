/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package first;

import second.BBresp;

/**
 * @author :IRFAN
 *TIME:6:26:13 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderfinaldemo
 */
public class Abuilderres {
	public AAres m1(BBresp resp){
		System.out.println("from res"+resp);
		AAres s=new AAres();
		s.setBalance(resp.getBalance());
		s.setExpdate(resp.getExpdate());
		return s;
	}

}
