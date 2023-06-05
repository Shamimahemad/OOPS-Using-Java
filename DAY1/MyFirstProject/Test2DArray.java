import java.util.Scanner;

public class Test2DArray {
    public static void accpetdata(int[][] arr) {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.println("enetr number");
    			arr[i][j]=sc.nextInt();
    		}
    	}
    }
    
    public static void displaydata(int[][] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.print(arr[i][j]+"\t");
    			
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		accpetdata(arr);
		displaydata(arr);
	}

}
