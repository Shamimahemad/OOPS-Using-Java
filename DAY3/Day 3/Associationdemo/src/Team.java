
public class Team {
	private int tid;
	private String tname;
	private Player capt;
	private Player[] plist;
	public Team() {
		this.tid=0;
		this.tname=null;
		this.capt=null;
		this.plist=null;
	}
	public Team(int id,String nm,Player c,Player[] parr) {
		this.tid=id;
		this.tname=nm;
		this.capt=c;
		this.plist=parr;
	}
	public void setTid(int id) {
		this.tid=id;
	}
	
	public void setTname(String nm) {
		this.tname=nm;
		
	}
	public void setCapt(Player p) {
		this.capt=p;
		
	}
	public void setPlist(Player[] parr) {
		this.plist=parr;
	}
	
	public int getTid() {
		return tid;
	}
	public String getTname() {
		return tname;
	}
	public Player getCapt() {
		return capt;
	}
	public Player[] getPlist() {
		return plist;
	}
	
	public String toString() {
		String str="";
		for(int i=0;i<plist.length;i++) {
			str+=plist[i].toString()+"\n";
		}
		
		return "Id : "+tid +"Team name : "+tname+"Captain : "+capt+"\nPlayer list : " +str;
	}

}
