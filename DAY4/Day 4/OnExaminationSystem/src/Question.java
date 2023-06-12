
public class Question {
	private int qno;
	private String quest;
	private String[] option;
	private String ans;
	private int marks;
	public Question() {
		qno=0;
		quest=null;
		option=new String[4];
		ans=null;
		marks=0;
	}
	public Question(int qno,String que,String[] op,String ans,int mks) {
		this.qno=qno;
		quest=que;
		option=op;
		this.ans=ans;
		marks=mks;
	}
	
	public void setQno(int no) {
		this.qno=no;
	}
	public void setQuest(String q) {
		this.quest=q;
	}
	public void setOption(String[] op) {
		this.option=op;
	}
	public void setAns(String ans) {
		this.ans=ans;
	}
	public void setMarks(int mks) {
		this.marks=mks;
	}
	public int getQno() {
		return this.qno;
	}
	public String getQuest() {
		return this.quest;
	}
	public String[] getOption() {
		return this.option;
	}
	public String getAns() {
		return this.ans;
	}
	public int getMarks() {
		return this.marks;
	}
	public String toString() {
		String str="";
		
		for(int i=0;i<option.length;i++) {
			str+=(i+1)+"."+option[i]+"\n";
		}
		return "Quesno :"+qno+"\nQuestion: "+quest+"\n Options "+ str+"\n Answer : "+ans+"\nMarks : "+marks;
	}
}
