package ByMe;

public class FindingMaxNumber {
	public static void main(String[] args) {
		int [] ar ={25,45,12,10,65,85,55};
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		// For Finding Max value in Array
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i]>min) {
				min=ar[i];
			}
			
		}
		System.out.println("For MAXIMUM Number : "+min);
		
		System.out.println("-----------------------------------------------------");
		
		// For Finding Minimum Value in Array
		
		for(int j = 0;j<ar.length;j++) {
			if(ar[j]<max) {
				max=ar[j];
			}
		}
		System.out.println("For Minimum Number : "+max);
		
		
		
	}

}
