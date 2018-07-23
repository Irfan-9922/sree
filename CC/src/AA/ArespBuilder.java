/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package AA;

import B.Bresp;

/**
 * @author :IRFAN
 *TIME:3:36:11 pm
 * DATE:12-May-2017
 *PROJECTNAME:CC
 */
public class ArespBuilder {
	
	public Aresp m1(Bresp remo){
		System.out.println("from Arespbuilder");
		Aresp bb=new Aresp();
		bb.setOrdeiId(remo.getOrdeiId());
		bb.setPrise(remo.getPrise());
		bb.setStatus(remo.getStatus());
		return bb;
	}

	
	
}
