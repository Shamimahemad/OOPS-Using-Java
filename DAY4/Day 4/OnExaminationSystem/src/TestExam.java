import java.time.Period;

public class TestExam {
public static void main(String[] args) {
	String[] op= {"aa","bb","cc","dd"};
	Question q1=new Question(1,"xxxxx",op,"1",1);
	Question q2=new Question(2,"yyyy",op,"2",1);
	Question q3=new Question(3,"eeeeee",op,"4",1);
	Question q4=new Question(4,"pppppp",op,"1",1);
	Question q5=new Question(5,"vvvvvvv",op,"3",40);
	Question[] q={q1,q2,q3,q4,q5};
	Exam e=new Exam(12,"mid-term",40,1,q );
	System.out.println(e);
	//to sdisplay 3 rd question in the exam
	System.out.println(e.getQuestions()[2].getQuest());
	//display answer of 2nd question
	System.out.println(e.getQuestions()[1].getAns());
}

}
