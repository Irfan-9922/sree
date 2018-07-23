package com.ij;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//first you have to create the file ind=satance
		File file=new File("E://temp/demo.txt");
		//creating the scanner instanvce to read the file
		Scanner sc=new Scanner(file);
		//reading each line using file scanner
		int line=1;
		while(sc.hasNextLine())
		{
			String l=sc.nextLine();
			System.out.println("line"+line+":"+l);
			line++;
		}

	}

}
