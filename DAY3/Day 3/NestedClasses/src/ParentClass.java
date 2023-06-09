
public class ParentClass {
	private int pnum;
	private static int count=0;
	//nested static class
	 static class ChildClass{
		  public void m1() {
			  //non static member of parent class are not accessible
			  //System.out.println(pnum);
			  System.out.println("Parent Count:" +count);
		  }
	}

}
