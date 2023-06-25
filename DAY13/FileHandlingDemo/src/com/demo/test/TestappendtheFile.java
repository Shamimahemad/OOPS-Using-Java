package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestappendtheFile {

	public static void main(String[] args) {
		File f=new File("test.txt");
		FileOutputStream fos=null;
		try {
			if(!f.exists()) {
				
				fos=new FileOutputStream("test.txt");
				
			}else {
				fos=new FileOutputStream("test.txt",true);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("test.txt");
			FileOutputStream fos1=fos;){
			int i=fis.read();
			while(i!=-1) {
				fos1.write(i);
				i=fis.read();
			}
			
		}catch(IOException e) {
			
		}finally {
			
		}
		
		

	}

}
