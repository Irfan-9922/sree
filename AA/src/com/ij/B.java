package com.ij;

import c.C;
import c.Creq;
import c.Cresp;

/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */

/**
 * @author :IRFAN
 *TIME:10:35:12 am
 * DATE:11-May-2017
 *PROJECTNAME:BB
 */
public class B {
	public Bresp bresp(Breq breq){
		System.out.println("inside b class"+breq);
		Creq c=new Creq();
		c.setChannelId(breq.getChannelId());
		c.setClientId(breq.getClientId());
		c.setReqId(breq.getReqId());
		C f=new C();
		Cresp vv=f.cresp(c);
		Bresp b=new Bresp();
		b.setRespmsg(vv.getRespmsg());
		b.setStatus(vv.getStatus());
		return b;
		
	}

}
