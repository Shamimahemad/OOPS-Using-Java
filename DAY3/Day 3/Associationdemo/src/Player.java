
public class Player {
	private int pid;
	private String pname;
	private String skill;
	//default constructor
	public Player() {
		this.pid=0;
		this.pname=null;
		this.skill=null;
	}
	//parametrized constructor
	public Player(int pid, String pnm,String sk) {
		this.pid=pid;
		this.pname=pnm;
		this.skill=sk;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setPname(String pnm) {
		this.pname=pnm;
	}
	public void setSkill(String skill) {
		this.skill=skill;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public String getSkill() {
		return skill;
	}
	public String toString() {
		return "Id : "+pid+" Name : "+pname+" Skill : "+skill;
	}

}
