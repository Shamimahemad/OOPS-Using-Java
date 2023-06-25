package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestreadFile {

	public static void main(String[] args) {
		try {
		Path p=Paths.get("./testfile1.txt");
		
			List<String> lst=Files.readAllLines(p);
			System.out.println(lst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
