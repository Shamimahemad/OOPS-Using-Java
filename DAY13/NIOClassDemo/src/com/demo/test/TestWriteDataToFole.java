package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestWriteDataToFole {

	public static void main(String[] args) {
		try {
		   Path p=Paths.get("./testfile1.txt");
		   String str="this data will be written to the file";
		    byte[] b=str.getBytes();
		 	Files.write(p, b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
