package demo;

import javax.xml.ws.Endpoint;

public class dd {
  static String s="http://localhost:1777/irfan?wsdl";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		Endpoint.publish(s, t);
		System.out.println("published");

	}

}
