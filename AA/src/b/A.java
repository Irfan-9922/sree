package b;
import com.ij.B;
import com.ij.Breq;
import com.ij.Bresp;

import refactor.reqbuilder;
import refactor.responceBuilder;

/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */

/**
 * @author :IRFAN
 *TIME:10:28:12 am
 * DATE:11-May-2017
 *PROJECTNAME:AA
 */
public class A {
	public Aresp aresp(Areq areq){
		Aresp a=new Aresp();
		Breq breq=new Breq();
		B h=new B();
		reqbuilder d=new reqbuilder();
		//d.breq();
		Bresp resp =h.bresp(breq);
		responceBuilder aa=new responceBuilder();
		
		aa.resopncebuilder1();
		return a;
	}
	public static void main(String[] args) {
		A n=new A();
		//Areq s=new Areq();
		reqbuilder s=new reqbuilder();
		responceBuilder ns=new responceBuilder();
		ns.resopncebuilder1();
		s.setChannelId("online");
		s.setClientId("122");
		s.setReqId("web");
		s.demo();
		Aresp e=new Aresp();
	ns.resopncebuilder1();
		System.out.println(e.ns(s));
		
		
	}

}
