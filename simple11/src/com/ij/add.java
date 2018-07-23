package com.ij;

import javax.jws.WebService;

@WebService
public class add {
	public String getname(String name)
	{
		return "hello "+name;
	}

}
