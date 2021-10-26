package Introduction.ByHiteshSir;

import java.util.Scanner;

public class A5 {
	
	public void displayarray(int[] ar) {
		for(int i = 0;i<ar.length;i++) {
			System.out.printf("Value at %s[%d] is : %d ",ar,i,ar[i]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A5 a = new A5();
	// Setting values of an array
		System.out.println("Enter Size of an Array :");
		int size = sc.nextInt();
		int array[]=new int[size];
		String name = "array";
		
		for (int i =0;i<array.length;i++) {
			System.out.printf("Enter value at %s[%d] is : ",name,i);
			System.out.println();
			int num = sc.nextInt();
			array[i]=num;
			
		}
		
		a.displayarray(array);
		
		
	}

}
