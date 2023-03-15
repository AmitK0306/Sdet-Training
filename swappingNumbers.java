
public class swappingNumbers {

	public static void main(String[] str) {
		
		int x =25;
		int y=15;
		int z =0;
		//printing original values
		System.out.println("Before Exchanging Value of x  : " + x +  "  value of y : "+ y);
		
		z=y;
		y=x;
		x=z;
		// printing values after swapping using 3rd variable
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
		z = x+y;
		x=z-x;
		y=z-y;
		// printing values after swapping using 3rd variable
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
		
		
		x=x-y;
		y=x+y;
		x=y-x;
		// printing values after swapping without using 3rd variable
		System.out.println("After exchanging Value of x  : " + x +  "  value of y : "+ y);
		
	}
	
	
	
	
}
