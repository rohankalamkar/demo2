package Introduction.ByHiteshSir;

import java.util.Scanner;

public class A2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array : ");
		int size = sc.nextInt();
		int x[]=new int[size];
		// storing loop
		for(int i =0;i<x.length;i++ ) {
			System.out.printf("Enter x[%d] index number : ",i);
			System.out.println();
			int num = sc.nextInt();
			x[i]=num;
			
			
		}
		
		System.out.println("------------------Ascending Order--------------------------");
		// Printing Loop
		for(int i = 0;i<x.length;i++) {
			System.out.printf("Number on x[%d] index is : %d ",i,x[i]);
			System.out.println();
		}
		
		System.out.println("------------------Reverse Order--------------------------");
		
		for(int i=x.length-1;i>=0;i--) {
			System.out.printf("Number in x[%d] is : %d",i,x[i]);
			System.out.println();
		}
		
		
		
		
	}

}
