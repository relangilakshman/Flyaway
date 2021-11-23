package com.lockers.main;

import java.io.IOException;
import java.util.Scanner;

public class Home {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		String choice=null;
		do {
		System.out.println("*********Welome To Lockers.com********");
		System.out.println("1).Add File" );	
		System.out.println("2).Delete File" );	
		System.out.println("3).Search File" );	
		System.out.println("4).CLOSE" );
		Scanner scnr = new Scanner(System.in); 
		System.out.println("Enter your Choice");
		 choice = scnr.next();  
        System.out.println("Your Choice is :" + choice); 
      
		if(choice.equals("1"))
		{
			AddFileDemo.addFile();
			  
			
		}
		else if(choice.equals("2"))
		{
			DeleteFileDemo.deleteFile();
			
		}
		
		else if(choice.equals("3"))
		{
			SearchFileDemo.searchFile();
			
		}else {
			System.out.println("***File Operations Closed**");
		}
		System.out.println("****************************************");
       
		

	}
	while(! choice.equals("4")) ;
	
}
	

}
