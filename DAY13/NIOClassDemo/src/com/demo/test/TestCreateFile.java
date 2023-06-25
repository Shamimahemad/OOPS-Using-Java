package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestCreateFile {

	public static void main(String[] args) {
		Path p=Paths.get("./testfile.txt");
		try {
			Files.createFile(p);
			System.out.println("you created a file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
