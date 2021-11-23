package com.lockers.add;

import java.io.File;
import java.io.IOException;

public class AddFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myFile=new File("D:\\javademo\\File1.txt");
		
		
			try {
			if(myFile.createNewFile())
				{
					System.out.println("File added successfully");
				}
					else
					{
						System.out.println("File not added");
				}
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				System.out.println("File added error");
			}
		
		}
		

	}

