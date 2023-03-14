
public class swappingNumbers {

	public static void main(String[] str) {
		
		int x =2;
		int y=1;
		int z =0;
		
		System.out.println("Value of x  : " + x +  "  value of y : "+ y);
		
		z=y;
		y=x;
		x=z;
		
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
		z = x+y;
		x=z-x;
		y=z-y;
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
		
		
		x=x-y;
		y=x+y;
		x=y-x;
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
	}
	
	
	
	
}
