package Introduction.ByHiteshSir;

import java.util.Scanner;

public class A4 {
	
	public int[] getArray(int ar[]) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<ar.length;i++) {
			System.out.printf("Enter number for ar[%d] is : ",i);
			System.out.println();
			int num = sc.nextInt();
			ar[i]=num;
			
		}
		
		return ar;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A4 a = new A4();
		
		
		System.out.println("Enter Size of an array : ");
		int size = sc.nextInt();
		int [] ar = new int[size];
		
		int [] x = a.getArray(ar);
		
		// for displaying 
		for(int i = 0;i<ar.length ;i++ ) {
			System.out.printf("Value at ar[%d] is : %d ",i,x[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	

}
