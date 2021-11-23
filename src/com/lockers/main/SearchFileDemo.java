package com.lockers.main;

import java.io.File;
import java.io.IOException;

public class SearchFileDemo {
	
	public static void searchFile()
	{

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
		File myFile=new File("D:\\javademo\\File1.txt");
		
		
			if(myFile.exists())
				{
					System.out.println("File exist");
				}
					else
					{
						System.out.println("File not exist");
				}
		
		
	}

	

}
