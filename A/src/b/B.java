package b;

import Bbeans.Breq;
import Bbeans.Bresp;
import C.C;
import Cbeans.Creq;
import Cbeans.Cresp;

public class B {

	public Bresp bbresp(Breq breq)
	{
		Creq creq=new Creq();
		creq.setOid(breq.getOid());
		creq.setOname(breq.getOname());
		C c=new C();
		Cresp cresp=c.cresp(creq);
		
		Bresp bresp=new Bresp();
		bresp.setStatus(cresp.getStatus());
		return bresp;
		
	}
	
}
