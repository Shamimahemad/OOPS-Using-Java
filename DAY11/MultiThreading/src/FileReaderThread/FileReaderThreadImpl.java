package FileReaderThread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThreadImpl extends Thread{
	private String fileName;
	private String word;
	public FileReaderThreadImpl(String fileName,String word) {
		this.fileName=fileName;
		this.word=word;
	}

	@Override
	public void run() {
		try(BufferedReader br=new BufferedReader(new FileReader(fileName));){
			String search=null;
			 do {
				 search=br.readLine();
				 if(search.contains(word)) {
					 System.out.println("Found Word : "+word);
					 return;
				 }
				
			 }while(search!=null);
			 System.out.println("Not Found Word : "+word);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
