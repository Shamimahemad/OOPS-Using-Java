package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

import com.demo.service.MyService;
import com.demo.service.MyServiceImpl;

public class TestNio {

	public static void main(String[] args) {
		MyService fs=new MyServiceImpl();
		try(FileInputStream fis=new FileInputStream("testfile1.txt");
			FileOutputStream fos=new FileOutputStream("destination.txt");	){
			ReadableByteChannel src=fis.getChannel();
			WritableByteChannel dest=fos.getChannel();
			fs.copyData(src,dest);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
