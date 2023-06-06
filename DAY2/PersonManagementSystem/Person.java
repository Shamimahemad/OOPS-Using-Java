import java.text.SimpleDateFormat
 import java.util.Date;

public class Person {
	private int pid;
	private String pname;
	private String mobile;
	private Date bdate;
	
	public Person() {
		//calling parametrized constructor of same class
		//this(0,null,null,null);
		this.pid=0;
		this.pname=null;
		this.mobile=null;
		this.bdate=null;
	}
	
	public Person(int id,String name,String m, Date bdt) {
		this.pid=id;
		this.pname=name;
		this.mobile=m;
		this.bdate=bdt;
	}
	public void setPid(int p) {

		this.pid=p;
	}
	public void setPname(String nm) {
		this.pname=nm;
	}
	public void setMobile(String m) {
		this.mobile=m;
	}
	public void setBdate(Date bdt) {
		this.bdate=bdt;
	}
	public int getPid() {0
		return  pid;
	}
	public String getPname() {
		return  pname;
	}
	public String getMobile() {
		return  mobile;
	}
	public Date getBdate() {
		return  bdate;
	}
	public String toString() {
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		String bdt=sdt.format(this.bdate);
		return "Id: "+pid+"\nName : "+pname+"\nMobile: "+this.mobile+"\n Birt date: "+ bdt;
	}

}
