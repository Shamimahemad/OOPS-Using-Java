import java.util.Scanner;

public class TestVariableArray {

	public static void main(String[] args) {
		//int[][][][] arr=new int[3][2][][];  //error
		int[][] arr=new int[3][];
		Scanner sc=new Scanner(System.in);
		//accept datag
		for(int i=0;i<arr.length;i++) {
			System.out.println("how many columns");
			int col=sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enetr number");
    			arr[i][j]=sc.nextInt();
			}
			
		}
		//display data
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
    			
			}
			System.out.println();
		}
	}

}
