/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package refactor;

import com.ij.Bresp;

import b.Aresp;

/**
 * @author :IRFAN
 *TIME:12:11:19 pm
 * DATE:11-May-2017
 *PROJECTNAME:AA
 */
public class responceBuilder {
	public void resopncebuilder1(){
		Bresp resp=new Bresp();
		Aresp a=new Aresp();
		a.setRespmsg(resp.getRespmsg());
		a.setStatus(resp.getStatus());
	}

}
