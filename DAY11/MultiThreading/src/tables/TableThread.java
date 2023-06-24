package tables;

public class TableThread extends Thread{
    private int num;
	public void printTable(int num) {
		this.num=num;
	}
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
	}

}
