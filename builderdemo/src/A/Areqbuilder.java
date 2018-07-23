/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package A;

import B.breq;

/**
 * @author :IRFAN
 *TIME:1:24:26 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class Areqbuilder {
	
	public breq builder(areq a){
		
		breq b=new breq();
		b.setId(a.getId());
		b.setName(a.getName());
		return b;
		
	}

}
