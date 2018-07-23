package a;

import Abeans.Areq;
import Abeans.Aresp;
import Bbeans.Breq;
import Bbeans.Bresp;
import b.B;

public class A {

	public Aresp aresp(Areq areq)
	{
		System.out.println("inside a class+"+areq);
	
		Breq breq=new Breq();
		breq.setOid(areq.getOid());
		breq.setOname(areq.getOname());
		B b=new B();
		Bresp bresp=b.bbresp(breq);
		Aresp aresp=new Aresp();
		aresp.setStatus(bresp.getStatus());
		return aresp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		Areq areq=new Areq();
		areq.setOid(12);
		areq.setOname("mobile");
		Aresp ares=new Aresp();
		//a.aresp(areq);
		System.out.println("irfan"+a.aresp(areq));
	

	}

}
