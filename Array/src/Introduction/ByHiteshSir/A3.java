package Introduction.ByHiteshSir;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		
		int ar []= new int[size];
		// Storing loop
		for(int i=0;i<ar.length;i++) {
			System.out.printf("Enter value for ar[%d] is : ",i);
			System.out.println();
			int num = sc.nextInt();
			ar[i]=num;
			
		}
		for(int element : ar) {
			int i = 0;
			System.out.printf("Number in x[%d] is : %d ",i,element);
			System.out.println();
			i++;
		}
		
		
		
		
		
	}

}
