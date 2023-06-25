package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestWalkThrough {

	public static void main(String[] args) {
		try {
			Path p=Paths.get(".");
			System.out.println(Files.walkFileTree(p,null,0,null));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
