package Introduction.ByHiteshSir;

public class A1 {
	
	int x[]=new int[5];  // This is allowed  initialize  i.e (declaration + Creation is allowed only)
//	x[0]=10;  // Initialization is not allowed with this case in gloabaly
//	x[1]=20;
//	x[2]=30;
//	x[3]=40;
//	x[4]=50;
	
	int y[]= {10,20,30,40,50};   //(Declaration + Creation + Initialization) You can only declared Globally 
	
	public static void main(String[] args) {
		
		A1 a = new A1();
		
		int x[]=new int[5];
		x[0]=10;  
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println("Size of local x[] array is "+x.length);
		System.out.println("Hashcode x Local : "+x.hashCode());
		System.out.println("---------------------------------------------------------");
		System.out.println(a.y[0]);
		System.out.println(a.y[1]);
		System.out.println(a.y[2]);
		System.out.println(a.y[3]);
		System.out.println(a.y[4]);
		System.out.println("Size of Global y[] is : "+a.y.length);
		System.out.println("Hashcode y Globally : "+a.y.hashCode());
		System.out.println("Size of Global x[] is : "+a.x.length);
		System.out.println("Hashcode x Gobally : "+a.y.hashCode());
		System.out.println("---------------------------------------------------------");
		a.x[0]=60;
		//a.x[5]=80;  // ArrayIndexOutOfBoundsException
		//a.y[5]=70;  // ArrayIndexOutOfBoundsException
		//System.out.println(a.y[5]);  
		//System.out.println(a.x[5]);  
		
		
		
		
		
		
	}
	

}
