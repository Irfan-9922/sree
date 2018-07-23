package demo;

import javax.jws.WebService;

@WebService
public class simple {
	public String getname(String firstName)
	{
		return "your name"+firstName;
	}

}
