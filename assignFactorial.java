// program for finding the factorial of a number
public class assignFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, num,fact;
		num=6;
		fact=1;
		
		for (i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of a no is "+ fact);
	}

}
