package com.lockers.main;

import java.io.File;
import java.io.IOException;

public class AddFileDemo {
	
	public static void addFile()
	{

		// TODO Auto-generated method stub
		
		File myFile=new File("D:\\javademo\\File1.txt");
		
		
			try {
				
				
		if(! myFile.exists()) {		
			if(myFile.createNewFile())
				{
					System.out.println("File added successfully");
				}
					else
					{
						System.out.println("File not added");
				}
			}else {
				System.out.println("File already exist");
			}
			}catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				System.out.println("File added error");
			}
		
		
	}

	
		

	}

