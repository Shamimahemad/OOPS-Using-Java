
public class PHDStudent extends Student{
	private String thesis;
	private int sp_sub_mks;
	
	public PHDStudent() {
		super();
	}

	public PHDStudent(String type,String pname,String mobile,int m1,int m2,int m3,String thesis, int sp_sub_mks) {
		super(type,pname,mobile,m1,m2,m3);
		this.thesis = thesis;`		
		this.sp_sub_mks = sp_sub_mks;
	}

	@Override
	public String toString() {
		return super.toString()+" PHDStudent [thesis=" + thesis + ", sp_sub_mks=" + sp_sub_mks + "]";
	}

	@Override
	public int calculateGrade() {
		return (m1+m2+m3+sp_sub_mks)/4;
	}
	
	

}
