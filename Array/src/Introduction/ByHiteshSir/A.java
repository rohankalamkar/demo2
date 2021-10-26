package Introduction.ByHiteshSir;

public class A {
	//int x[] ;    // Only Declaration in globally not allowed
	//x=new int[5];
	int y[] = {10,20,30,40,50};  // (Declairation + Creation + Initialization ) is allowed 
	
	int z[]= new int[5];   // Declaration + Creation is allowed but we cannot initialized Globally here with this
	

	
	public void m1() {
		int x[];
		x=new int[5];
		
		int y[]= {10,20,30,40,50};
		int z[]=new int[5];
		
	}
	public static void main(String[] args) {
		int x[];
		x=new int[5];
		
		int y[]= {10,20,30,40,50};
		
		int z[]=new int[5];
		
		
	}

}
