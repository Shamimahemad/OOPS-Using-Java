package tables;

public class TestThread {

	public static void main(String[] args) {
		TableThread th1=new TableThread();
		TableThread th2=new TableThread();
		th1.printTable(5);
		th2.printTable(7);
		th1.start();
		th2.start();
		
		
	
	}

}
