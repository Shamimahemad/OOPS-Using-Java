
public class Thread1 extends Thread{
	
	private int id;
	private String name;
	public Thread1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void run() {
		System.out.println("id= "+id+", name= "+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
