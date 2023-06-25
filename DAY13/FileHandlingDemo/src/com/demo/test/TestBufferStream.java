package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferStream {

	public static void main(String[] args) {
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test.txt"));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("testcopy.txt"))){
			int i=bis.read();
			while(i!=-1) {
				bos.write(i);
				i=bis.read();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
