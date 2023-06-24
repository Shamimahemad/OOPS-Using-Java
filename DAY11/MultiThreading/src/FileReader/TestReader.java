package FileReader;

import java.util.Scanner;


import FileReaderThread.FileReaderThreadImpl;

public class TestReader {

	public static void main(String[] args) {
		FileReaderThreadImpl[] frt =new FileReaderThreadImpl[5];
	
		Scanner sc = new Scanner(System.in);
		String word=null;
		for(int i=0;i<5;i++) {
			System.out.println("Enter Word "+(i+1)+"... ");
			word=sc.next();
			frt[i]=new FileReaderThreadImpl("Ganesh.txt",word);
		}
		
		for(int i=0;i<5;i++) {
			frt[i].start();
		}
		try {
			frt[4].join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Main Ends");
		sc.close();
	}

}
