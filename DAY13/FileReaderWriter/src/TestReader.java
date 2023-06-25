import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("test.txt");
				FileWriter fout=new FileWriter("testcopy.txt")){
			    int x=fr.read();
			    while(x!=-1) {
			    	System.out.println(x);
			    	fout.write(x);
			    	x=fr.read();
			    }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
