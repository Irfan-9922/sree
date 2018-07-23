package com.ij;

import javax.xml.ws.Endpoint;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:1313/irfan?wsdl";
  add a=new add();
  Endpoint.publish(url, a);
  System.out.println("published");
	}

}
 