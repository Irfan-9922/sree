package collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class storedemo {
	private int customer;
	private String name;
	private int dob;
	private int cdno;
	private int cvvno;
	private int exp;
	private int bal;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Map<String, ArrayList<demo>> me=new HashMap<String,ArrayList<demo>>();
		ArrayList<demo> k=new ArrayList();
		demo d=new demo();
		d.setCustomer(1);
		d.setName("irfan");
		d.setDob(12);
		d.setCdno(12121);
		d.setCvvno(1212);
		d.setExp(12);
		d.setBal(232323);
		k.add(d);
		
		me.put("first", k);
		//System.out.println(me);
	Set s=	me.entrySet();
	Iterator itr=s.iterator();
	
		Iterator a=k.iterator();
		while(a.hasNext()){
		Object ele=a.next();
		System.out.println(ele==d.getName());
		
			
		
	}
		

	
	
	}

}
