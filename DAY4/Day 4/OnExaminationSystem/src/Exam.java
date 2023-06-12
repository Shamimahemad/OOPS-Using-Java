import java.time.Period;

public class Exam {
     private int examno;
     private String examname;
     private int marks;
     private int duration;
     private Question[] questions;
     public Exam() {
    	 examno=0;
    	 examname=null;
    	 marks=0;
    	 duration=0;
    	 questions=new Question[5];
     }
     public Exam(int eno,String ename,int mks,int dur,Question[] q) {
    	 examno=eno;
    	 examname=ename;
    	 marks=mks;
    	 duration=dur;
    	 questions=q;
     }
     public void setExamNo(int no) {
    	 this.examno=no;
    	 
     }
     public int getExamNo() {
    	 return this.examno;
    	 
     }
     public void setExamname(String e) {
    	 this.examname=e;
    	 
     }
     public String getExamname() {
    	 return this.examname;
    	 
     }
     public void setMarks(int m) {
    	 this.marks=m;
    	 
     }
     public int getMarks() {
    	 return this.marks;
    	 
     }
     public void setDuration(int m) {
    	 this.duration=m;
    	 
     }
     public int getDuration() {
    	 return this.duration;
    	 
     }
     public void setQuestions(Question[] q) {
    	 this.questions=q;
    	 
     }
     public Question[] getQuestions() {
    	 return this.questions;
    	 
     }
     public String toString() {
    	 String str="";
    	 for(Question q:this.questions) {
    		 str+=q.toString();
    	 }
    	 
    	 return "Exam no: "+examno+"\nExam Name : "+examname+"Duration: "+this.duration+"Marks : "+this.marks+"questions "+str; 
     }
     
     
     
     
     
}
