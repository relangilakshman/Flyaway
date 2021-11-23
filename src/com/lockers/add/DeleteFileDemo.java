package com.lockers.add;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 File myFile=new File("D:\\javademo\\File1.txt");
		 if(myFile.delete()) {
			 System.out.println("File deleted: "+myFile.getName()+" successfully");
		 }
		 else {
			 System.out.println("File not deleted");
		 }
	}

}
