import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class DateClassDemo{
   public static void main(String args[]){
       // creates data class object and stores todays data
	   Date d=new Date();
	   System.out.println(d);
	   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	   //converts Date from java format to string format
	      String dt=sdf.format(d);
		  System.out.println("converted date in user format: "+dt);
		  //to convert date from user format to java format
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter date in (dd/mm/yyyy) format");
		  String sdt=sc.next();
		  try{
			  //parse function converts String to java date format
			  Date dt1=sdf.parse(sdt);
			  System.out.println("Converted date in java format");
			  System.out.println(dt1);
		  }catch(ParseException e){
			 System.out.println(e); 
		  }
	   
   }
}