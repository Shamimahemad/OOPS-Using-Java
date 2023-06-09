
import java.util.Scanner;

public class TeamService {
	public static Team[] tlist;
	public static int cnt;
	static {
		tlist=new Team[15];

		cnt=0;
		
	}
	//add new team object in tteam array
	    public static void addnewTeam() 
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr team id");
		int tid=sc.nextInt();
		sc.nextLine();
		System.out.println("enetr team name");
		String tnm=sc.nextLine();
		//accept caprtain details
		System.out.println("enter captains id");
		int cpid=sc.nextInt();
		System.out.println("enter captains name");
		String pname=sc.next();
		System.out.println("enter captains skill");
		String skill=sc.next();
		Player cp=new Player(cpid,pname,skill);
		//accept 5 players details
		Player[] arr=new Player[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter player id");
			cpid=sc.nextInt();
			System.out.println("enter player name");
			 pname=sc.next();
			System.out.println("enter player skill");
			 skill=sc.next();
			 arr[i]=new Player(cpid,pname,skill);
		}
		//add new team object in the array
		tlist[cnt]=new Team(tid,tnm,cp,arr);
		cnt++;
		
		
	}
	//display all team details
	public static void displayall() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tlist[i]);
		}
		
	}
	//search a team by captain name
	public static Team searchByCaption(String cname) {
		for(int i=0;i<cnt;i++) {
			//retrive captain name
			String name=tlist[i].getCapt().getPname();
			if(name.equals(cname)) {
				return tlist[i];
			}
		}
		return null;
	}
	public static void searchBySkill(String skill) {
		//Team t=searchByTeamID(tid);
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<tlist[i].getPlist().length;j++) {
				if(tlist[i].getPlist()[j].getSkill().equals(skill)) {
					System.out.println(tlist[i].getPlist()[j].getPname());
				}
			}
		}
		
	}
	
	

}
