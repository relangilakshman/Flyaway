package com.lockers.add;

import java.io.File;
import java.io.IOException;

public class SearchFileDemo {

	public static void main(String[] args) {
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
