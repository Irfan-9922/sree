package com.nareshit.client;

import com.nareshit.service.Demo;
import com.nareshit.service.DemoService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 DemoService service=new DemoService();
 Demo sei=service.getDemoPort();
 
   String ss=sei.name("jjj");
  
   System.out.println(ss);

   
	}

}
