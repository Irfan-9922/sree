/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package AA;

import B.B;
import B.Breq;
import B.Bresp;

/**
 * @author :IRFAN
 *TIME:2:52:58 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderdemo
 */
public class A {
	public Aresp m1(Areq11 req){
		
		AreqBuilder areqb=new AreqBuilder();
		Breq breq=areqb.m1(req);
		B bbb=new B();
		Bresp dd=bbb.m1(breq);
		ArespBuilder op=new ArespBuilder();
		Aresp s  = op.m1(dd);
		/*Aresp a=new Aresp();
		a.setOrdeiId(dd.getOrdeiId());
		a.setPrise(dd.getPrise());
		a.setStatus(dd.getStatus());*/
		return s;
		
		
	}
	public static void main(String[] args) {
		A a=new A();
		Areq11 are=new Areq11();
		are.setItem("jeans");
		are.setLocetion("latur");
		are.setName("irfan");
		are.setQty("3");
		Aresp s=new Aresp();
		System.out.println(are.getName()+"your order is"+a.m1(are));
	}

}
