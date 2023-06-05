import java.util.Scanner;

public class TestArray {
public static void acceptdata(int[] arr) {
	  Scanner sc=new Scanner(System.in);
	   //accept data
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr number");
			arr[i]=sc.nextInt();
		}
}
public static void displaydata(int[] a) {
	//display data
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
}
public static void main(String[] args) {
	int[] arr=new int[3];
	acceptdata(arr);
	displaydata(arr);
	
}
}
