
public class Person {
	static int cnt;
	static {
		cnt=0;
	}
	private String pid;
	private String pname;
	private String mobile;
	public Person() {
		System.out.println("in person default constructor");
	}
	public Person(String type) {  
		System.out.println("in person one parameter constructor");
		cnt++;
		pid=type+cnt;
		pname=null;
		mobile=null;
	}
	public Person(String type,String pname,String mobile) {
		System.out.println("in person parameterized constructor");
		cnt++;
		pid=type+cnt;
		this.pname=pname;
		this.mobile=mobile;
	}
	
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	protected int m1() {
		System.out.println("in Person  m1");
		return 10;
	}	System.out.println("in m1");
	
	public String toString() {
		return "Id : "+pid+" Name : "+pname+" Mobile : "+mobile;
	}
	 

}
