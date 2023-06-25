package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAutoclosableBlock {
	public static void main(String[] args) {
		try (FileInputStream fis=new FileInputStream("test.txt");
			FileOutputStream fos=new FileOutputStream("testcopy.txt")){
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
