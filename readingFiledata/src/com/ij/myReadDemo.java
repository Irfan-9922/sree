package com.ij;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class myReadDemo {
	public static void m(String token){
		
	}
static int a;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create a file instance
		File file=new File("E://temp/demo.txt");
		/*//create the scanner instance
		Scanner sc=new Scanner(file);
		//create the variable to count the line
		int LineNumber=0;
		while(sc.hasNextLine())
		{
			String li=sc.nextLine();
			
			System.out.println(li);
			}*/
		//using bufferd reader
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line=null;
		while((line=br.readLine())!=null)
		{
			//System.out.println(line);
			//String[] s=line.split(" ");
			//System.out.println(s);
			
			
			String s=line;
			//System.out.println(s);
			//String[] s1=s.split("  ");
			//System.out.println(s1[0]);
			//System.out.println(s1[1]);
			//System.out.println(s1[2]);
			//System.out.println(s1[3]);
			//System.out.println(s1[4]);
			//System.out.println(s1[5]);
			StringTokenizer ss=(StringTokenizer) new StringTokenizer(s);
			 
			System.out.print(ss.nextElement()+"\t");
			if(ss.nextElement()!=null)
			{
				  
			}
			
			/*System.out.print( ss.nextElement()+"\t");

			System.out.print( ss.nextElement()+"\t");
			System.out.print( ss.nextElement()+"\t");
			System.out.print( ss.nextElement()+"\t");
			System.out.println( ss.nextElement()+"\t");*/
			
		}
		
	}
		
	
	 

}
