/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package A;

import B.bb;
import B.breq;
import B.bres;

/**
 * @author :IRFAN
 *TIME:1:18:10 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class A {
	public aresp enroll(areq areq){
		Areqbuilder ab=new Areqbuilder();
	 breq breq=ab.builder(areq);
	 bb b=new bb();
		bres bresp=b.enroll(breq);
		aresp aresp=new aresp();
		aresp.setCode(bresp.getCode());
		aresp.setStatus(bresp.getStatus());
		return aresp;
	}

  public static void main(String[] args) {
	
	  A a=new A();
	  areq ar=new areq();
	  ar.setId("123");
	  ar.setName("irfan");
	  aresp d=new aresp();
	 
	  System.out.println(a.enroll(ar));
}
}
