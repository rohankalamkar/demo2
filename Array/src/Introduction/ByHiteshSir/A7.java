package Introduction.ByHiteshSir;

import java.util.Scanner;

public class A7 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Capacity of Library... : ");
		int size = sc.nextInt();
		String Library[]= new String[size];
		for(int i = 0 ;i<Library.length;i++) {  // Book Adding
			System.out.printf("Add Book into Library at %d postion : ",(i+1));
			System.out.println();
			String book = sc.next(); 
			book+=sc.nextLine();
			Library[i]=book;
		}
		for(int i=0;i<Library.length;i++) {
			System.out.printf("Book in Library at %d postion is : ",i+1);
			System.out.print(Library[i]);
			System.out.println();
			
		}
		
		
		
		}

}
