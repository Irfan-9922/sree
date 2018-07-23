package demo;

import javax.xml.ws.Endpoint;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="http://localhost:1212/irfan1?wsdl";
		simple s=new simple();
		Endpoint.publish(url, s);
		System.out.println("published");
	}

}
